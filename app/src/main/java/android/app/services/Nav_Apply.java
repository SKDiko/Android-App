package android.app.services;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Nav_Apply extends Fragment {
    //Set title bar text
    public void onResume(){
        super.onResume();
        ((MainActivity) getActivity()).setActionBarTitle("Applications");
    }
    //Main Send Fragment
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nav_apply, container, false);
        //Course Application List
        ArrayList<String> lstCourse = new ArrayList<>();
        lstCourse.add("New Application");
        lstCourse.add("Continue Application");

        ListView viewCourse = view.findViewById(R.id.course_apply);
        ArrayAdapter<String> dptCourse = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, lstCourse);
        viewCourse.setAdapter(dptCourse);

        viewCourse.setOnItemClickListener((adapterView, view1, position, id) -> {
            Intent intent;
            String url;
            switch (dptCourse.getItem(position)){
                case "New Application":
                    url = "https://wsu.ac.za/index.php/study-with-us/undergraduate-academic-programmes/new-undergraduate-students/how-to-apply-the-process";
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                    break;
                case "Continue Application":
                    url = "http://itsapp.cle.intra.wsu.ac.za:7771/pls/prodi03/w99pkg.mi_login";
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                    break;
                default: intent = null;
            }
        });

        //Bursary Application List
        ArrayList<String> lstBursary = new ArrayList<>();
        lstBursary.add("NSFAS");
        lstBursary.add("ISFAP Bursary");
        lstBursary.add("NYDA Bursary");
        lstBursary.add("Funza Lushaka Bursary");
        lstBursary.add("Study Trust Bursaries");
        lstBursary.add("Bursaries South Africa");
        lstBursary.add("Go Study Bursaries");

        ListView viewBursary = view.findViewById(R.id.bursary_apply);
        ArrayAdapter<String> dptBursary = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, lstBursary);
        viewBursary.setAdapter(dptBursary);

        viewBursary.setOnItemClickListener((adapterView, view1, position, id) -> {
            Intent intent;
            String url;
            switch (dptBursary.getItem(position)){
                case "NSFAS":
                    url = "https://my.nsfas.org.za/Application/selfservice.jsp";
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                    break;
                case "ISFAP Bursary":
                    url = "https://applyonline.isfap.co.za/";
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                    break;
                case "NYDA Bursary":
                    url = "http://nydawebsite.azurewebsites.net/products-services/solomon-kalushi-mahlangu-scholarship-fund/";
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                    break;
                case "Funza Lushaka Bursary":
                    url = "http://www.funzalushaka.doe.gov.za/";
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                    break;
                case "Study Trust Bursaries":
                    url = "https://studytrust.org.za/";
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                    break;
                case "Bursaries South Africa":
                    url = "https://www.zabursaries.co.za/";
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                    break;
                case "Go Study Bursaries":
                    url = "https://www.gostudy.net/";
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                    break;
                default:
                    url = "";
                    intent = null;
            }
        });
        setHasOptionsMenu(true);
        return view;
    }
    //Menu Bar Options
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.option_menu, menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.item1:
                Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"WSU Application Services");
                String appUrl = "https://play.google.com/store/apps/";
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, appUrl);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
                return true;
            case R.id.item2:
                Intent intent = new Intent(getActivity(), Developer_Info.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
