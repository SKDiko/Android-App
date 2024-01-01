package android.app.services;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Collections;

public class Nav_Courses extends Fragment {
    //Set title bar text
    public void onResume(){
        super.onResume();
        ((MainActivity) getActivity()).setActionBarTitle("Find Course");
    }
    private ArrayAdapter<String> adapter;
    //Main Method
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ArrayList<String> courseList = new ArrayList<>();
        courseList.add("Diploma: Civil Engineering (ECP)");
        courseList.add("Diploma: Civil Engineering (Main)");
        courseList.add("Advanced Diploma: Civil Engineering");
        courseList.add("Diploma: Building (ECP)");
        courseList.add("Diploma: Building (Main)");
        courseList.add("Diploma: Electrical Engineering (ECP)");
        courseList.add("Diploma: Electrical Engineering (Main)");
        courseList.add("Advanced Diploma: Electrical Engineering");
        courseList.add("Diploma: Mechanical Engineering (ECP)");
        courseList.add("Diploma: Mechanical Engineering (Main)");
        courseList.add("Advanced Diploma: Mechanical Engineering");
        courseList.add("Diploma: ICT Business Analysis (ECP)");
        courseList.add("Diploma: ICT Business Analysis (Main)");
        courseList.add("Diploma: ICT Applications Development (ECP)");
        courseList.add("Diploma: ICT Applications Development (Main)");
        courseList.add("Advanced Diploma: ICT Applications Development");
        courseList.add("Diploma: ICT Support Services (ECP)");
        courseList.add("Diploma: ICT Support Services (Main)");
        courseList.add("Diploma: ICT Communication Networks (ECP)");
        courseList.add("Diploma: ICT Communication Networks (Main)");
        courseList.add("Advanced Diploma: ICT Communication Networks");
        courseList.add("Diploma: Fashion Design");
        courseList.add("Diploma: Fine Art");
        courseList.add("Advanced Diploma: Fine Art");
        courseList.add("Diploma: Analytical Chemistry (ECP)");
        courseList.add("Diploma: Analytical Chemistry (Main)");
        courseList.add("Advanced Diploma: Analytical Chemistry");
        courseList.add("Diploma: Consumer Science (ECP)");
        courseList.add("Diploma: Consumer Science (Main)");
        courseList.add("Diploma: Management (ECP)");
        courseList.add("Diploma: Management (Main)");
        courseList.add("Diploma: Public Management");
        courseList.add("Diploma: Human Resources Management (ECP)");
        courseList.add("Diploma: Human Resources Management (Main)");
        courseList.add("Diploma: Office Management and Technology (ECP)");
        courseList.add("Diploma: Office Management and Technology (Main)");
        courseList.add("Diploma: Tourism Management");
        courseList.add("Diploma: Public Relations Management (ECP)");
        courseList.add("Diploma: Public Relations Management (Main)");
        courseList.add("Diploma: Policing");
        courseList.add("Diploma: Small Business Management");
        courseList.add("Diploma: Local Government Finance (ECP)");
        courseList.add("Diploma: Local Government Finance (Main)");
        courseList.add("Diploma: Administrative Management");
        courseList.add("Diploma: Marketing Management");
        courseList.add("Higher Certificate: Versatile Broadcasting");
        courseList.add("Diploma: Journalism");
        courseList.add("Diploma: Internal Auditing (ECP)");
        courseList.add("Diploma: Internal Auditing (Main)");
        courseList.add("Diploma: Accountancy");
        courseList.add("Diploma: Financial Information Systems");
        courseList.add("Diploma: Hospitality Management");
        courseList.add("Diploma: Sport Management");
        courseList.add("Bachelor: Commerce (General)");
        courseList.add("Bachelor: Commerce (Economics)");
        courseList.add("Bachelor: Commerce (Business Management)");
        courseList.add("Bachelor: Accounting Science");
        courseList.add("Bachelor: Accounting");
        courseList.add("Bachelor: Administration");
        courseList.add("Bachelor: Education (Foundation Phase Teaching)");
        courseList.add("Bachelor: Education (Senior Phase & FET Teaching - Economics & Management Sciences)");
        courseList.add("Bachelor: Education (Senior Phase & FET Teaching - Technology Mathematics)");
        courseList.add("Bachelor: Education (Senior Phase & FET Teaching - Mathematics, Science & Technology)");
        courseList.add("Bachelor: Education (Senior Phase & FET Teaching - Humanities, Languages, Arts and Culture)");
        courseList.add("Bachelor: Education (Senior Phase & FET Teaching - Languages)");
        courseList.add("Bachelor: Education (Senior Phase & FET Teaching - Humanities)");
        courseList.add("Bachelor: Education (Senior Phase & FET Teaching - Arts and Culture)");
        courseList.add("Bachelor: Education (Senior Phase & FET Teaching - Consumer & Management Sciences)");
        courseList.add("Bachelor: Education (Senior Phase & FET Teaching - Business, Commerce and Management)");
        courseList.add("Diploma: Adult Community Education and Training (ACET)");
        courseList.add("Post Graduate Certificate: Education (Science)");
        courseList.add("Post Graduate Certificate: Education (Languages)");
        courseList.add("Post Graduate Certificate: Education (Humanities)");
        courseList.add("Bachelor: Education Honours (B. Ed Hons)");
        courseList.add("Master: Education (M. Ed)");
        courseList.add("Doctor: Education (D.Ed.)");
        courseList.add("English and Accounting OR Mathematics");
        Collections.sort(courseList);
        //Main Home Fragment
        View view = inflater.inflate(R.layout.nav_courses, container, false);
        ListView listView = view.findViewById(R.id.listView);
        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, courseList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((adapterView, view1, position, id) -> {
            Intent  intent = new Intent(getActivity(), Course_Description.class);
            intent.putExtra("selectedCourse", adapter.getItem(position));
            startActivity(intent);
        });
        setHasOptionsMenu(true);
        return view;
    }
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_search_icon, menu);
        MenuItem searchViewItem = menu.findItem(R.id.app_bar_search);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchViewItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchView.clearFocus();
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText.trim());
                return false;
            }
        });
    }

}
