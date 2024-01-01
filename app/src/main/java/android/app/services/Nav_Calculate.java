package android.app.services;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
//Calculate Fragment
public class Nav_Calculate extends Fragment {
    //Set title bar text
    public void onResume(){
        super.onResume();
        ((MainActivity) getActivity()).setActionBarTitle("Calculate Points");
    }
    private EditText mark1, mark2, mark3, mark4, mark5, mark6, mark7;
    private TextView points;
    private Button calculate, clear;
    //Main Method
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nav_calculate, container, false);
        mark1 = view.findViewById(R.id.txtSubject1);
        mark2 = view.findViewById(R.id.txtSubject2);
        mark3 = view.findViewById(R.id.txtSubject3);
        mark4 = view.findViewById(R.id.txtSubject4);
        mark5 = view.findViewById(R.id.txtSubject5);
        mark6 = view.findViewById(R.id.txtSubject6);
        mark7 = view.findViewById(R.id.txtSubject7);
        points = view.findViewById(R.id.txtPoints);
        calculate = view.findViewById(R.id.btnCalculate);
        clear = view.findViewById(R.id.btnClear);
        addListenerOnButton();
        setHasOptionsMenu(true);
        return view;
    }
    //Calculate Points Button Method
    @SuppressLint("SetTextI18n")
    public void addListenerOnButton() {
        calculate.setOnClickListener(view -> {
            String strMark1 = mark1.getText().toString();
            String strMark2 = mark2.getText().toString();
            String strMark3 = mark3.getText().toString();
            String strMark4 = mark4.getText().toString();
            String strMark5 = mark5.getText().toString();
            String strMark6 = mark6.getText().toString();
            String strMark7 = mark7.getText().toString();
            if (isEmpty(strMark1, strMark2, strMark3, strMark4, strMark5, strMark6, strMark7)) {
                Toast toast = Toast.makeText(getActivity(),"Please enter all fields", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            } else {
                int intMark1 = Integer.parseInt(strMark1);
                int intMark2 = Integer.parseInt(strMark2);
                int intMark3 = Integer.parseInt(strMark3);
                int intMark4 = Integer.parseInt(strMark4);
                int intMark5 = Integer.parseInt(strMark5);
                int intMark6 = Integer.parseInt(strMark6);
                int intMark7 = Integer.parseInt(strMark7);
                int point1 = getPoints(intMark1);
                int point2 = getPoints(intMark2);
                int point3 = getPoints(intMark3);
                int point4 = getPoints(intMark4);
                int point5 = getPoints(intMark5);
                int point6 = getPoints(intMark6);
                int point7 = getPoints(intMark7);
                int totPoints = point1 + point2 + point3 + point4 + point5 + point6 + point7;
                points.setText("Total Points: " + totPoints);
            }
        });
        //Clear Button Method
        clear.setOnClickListener(view -> {
            mark1.setText("");
            mark2.setText("");
            mark3.setText("");
            mark4.setText("");
            mark5.setText("");
            mark6.setText("");
            mark7.setText("");
            points.setText("Total Points: 0");
        });
    }
    //Check if all the TextFields are not empty Method
    private static boolean isEmpty(String value1, String value2, String value3, String value4, String value5, String value6, String value7){
        if (value1.isEmpty() || value2.isEmpty() || value3.isEmpty() || value4.isEmpty() || value5.isEmpty() || value6.isEmpty() || value7.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    //Get points Method
    private static int getPoints (int mark){
        if (mark >= 0 && mark <= 29){
            return 1;
        } else if (mark >= 30 && mark <= 39){
            return 2;
        } else if (mark >= 40 && mark <= 49){
            return 3;
        } else if (mark >= 50 && mark <= 59){
            return 4;
        } else if (mark >= 60 && mark <= 69){
            return 5;
        } else if (mark >= 70 && mark <= 79){
            return 6;
        } else {
            return 7;
        }
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
                String app_url = "https://play.google.com/store/apps/";
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, app_url);
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
