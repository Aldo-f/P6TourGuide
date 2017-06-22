/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aldofieuw.android.p6tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of family vocabulary words.
 */
public class HistoricalPlacesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.historical_ghent_patershol, R.string.historical_ghent_patershol_location, R.drawable.historical_ghent_patershol));
        locations.add(new Location(R.string.historical_ghent_prinsenhof, R.string.historical_ghent_prinsenhof_location, R.drawable.historical_ghent_prinsenhof));
        locations.add(new Location(R.string.historical_ghent_vrijdagsmarkt, R.string.historical_ghent_vrijdagsmarkt_location, R.drawable.historical_ghent_vrijdagsmarkt));
        locations.add(new Location(R.string.historical_ghent_kouter, R.string.historical_ghent_kouter_location, R.drawable.historical_ghent_kouter));
        locations.add(new Location(R.string.historical_ghent_camposanto, R.string.historical_ghent_camposanto_location, R.drawable.historical_ghent_camposanto));
        locations.add(new Location(R.string.historical_ghent_groentenmarkt, R.string.historical_ghent_groentenmarkt_location, R.drawable.historical_ghent_groentenmarkt));


        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}