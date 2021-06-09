package sg.edu.rp.c346.id20012912.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ListView lvExamTips;
    String[] arrTips;
    ArrayList<String>  lvExamTipsList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);
        arrTips = new String[5];
        arrTips[0] = " Don't just read the code, code it as much as possible during each practical session";
        arrTips[1] = " Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        arrTips[2] = "Prepare your template source code for each topic";
        arrTips[3] = " Create a few empty Android projects to speed up your coding during the exam";
        arrTips[4] = "Ensure that your Android Studio is up and running before the exam";


        /*lvExamTipsList = new ArrayList<>();
        lvExamTipsList.add(" Don't just read the code, code it as much as possible during each practical session");
        lvExamTipsList.add( " Seek help from the lecturer ASAP, don't wait till you lost in the jungle");
        lvExamTipsList.add("Prepare your template source code for each topic");
        lvExamTipsList.add(" Create a few empty Android projects to speed up your coding during the exam");
        lvExamTipsList.add("Ensure that your Android Studio is up and running before the exam");

         */
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,arrTips);

        lvExamTips.setAdapter(adapter);


    }
}