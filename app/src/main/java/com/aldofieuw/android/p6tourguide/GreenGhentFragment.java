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
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class GreenGhentFragment extends Fragment {

    public GreenGhentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.green_ghent_stbavo, R.string.green_ghent_stbavo_location, R.drawable.green_ghent_stbavo));
        locations.add(new Location(R.string.green_ghent_stpeter, R.string.green_ghent_stpeter_location, R.drawable.green_ghent_stpeter));
        locations.add(new Location(R.string.green_ghent_beguinages, R.string.green_ghent_beguinages_location, R.drawable.green_ghent_beguinages));
        locations.add(new Location(R.string.green_ghent_blaarmeersen, R.string.green_ghent_blaarmeersen_location, R.drawable.green_ghent_blaarmeersen));
        locations.add(new Location(R.string.green_ghent_ghentuniversity, R.string.green_ghent_ghentuniversity_location, R.drawable.green_ghent_ghentuniversity));
        locations.add(new Location(R.string.green_ghent_hofvanrijhove, R.string.green_ghent_hofvanrijhove_location, R.drawable.green_ghent_hofvanrijhove));
        locations.add(new Location(R.string.green_ghent_monastery, R.string.green_ghent_monastery_location, R.drawable.green_ghent_monastery));
        locations.add(new Location(R.string.green_ghent_naturedomaindebourgoyen, R.string.green_ghent_naturedomaindebourgoyen_location, R.drawable.green_ghent_naturedomaindebourgoyen));
        locations.add(new Location(R.string.green_ghent_smallbeguinage, R.string.green_ghent_smallbeguinage_location, R.drawable.green_ghent_smallbeguinage));
        locations.add(new Location(R.string.green_ghent_theworldofkina, R.string.green_ghent_theworldofkina_location, R.drawable.green_ghent_theworldofkina));

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
