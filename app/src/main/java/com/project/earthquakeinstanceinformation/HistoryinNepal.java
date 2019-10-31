package com.project.earthquakeinstanceinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HistoryinNepal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hin);
        //declare textviews
        TextView mTitlewindow= (TextView) findViewById(R.id.titlewindow);
        TextView mMessagewindow=(TextView) findViewById(R.id.messagewindow);

        mTitlewindow.setText("History of Earthquake in Nepal");

        StringBuilder stringBuilder= new StringBuilder();

        String someMessage ="Historical seismicity is the historical records of earthquakes preserved in different" +
                " form such as written history, chronicles, inscription etc which plays an important role in the seismic " +
                "hazard assessment because instrumentally recorded earthquakes are lacking before the current century. " +
                "Historical events must be available for a long period of human civilization which should throw light on " +
                "the extent of damage besides the date and place of occurrence. \n \n" +
                "The earthquake of 1255 A.D. has been reported to destroy many houses and temples and killing one third to one" +
                " fourth population of the Kathmandu Valley. The assigned intensity is about X in MM scale (Chitrakar and Pandey, 1986)." +
                " The earthquake of 1408 A.D. has been reported to destroy the Machhendra Nath temple of Patan." +
                "Similarly the earthquake of 1681 A.D. and 1810 A.D. have been reported to occur but the exact" +
                " location of these earthquakes are not known. \n \n Recent research on historical data has well constrained" +
                " on the source size, magnitude and possible location of 1833 A. D. event (R.Bilham,1995) which devastated " +
                "Kathmandu valley. Its magnitude is reported to be of Mb=7.8 with possible rupture length of more than 70 km " +
                "and the event is located at 50 km North - North East of Kathmandu. \n \n The human casualties are reported" +
                " to be less than 500, which may be due to occurrence of two large foreshocks. The earthquake of 1934 A. D. is" +
                " the most devastating earthquake ever occurred in the territory of Nepal with casualties of more than 16000 " +
                "people including from Nepal and India put together. The rupture length is estimated to be 200 Km  100 Km " +
                "(Molnar and Pandey, 1994). \n \n The great earthquake, which occurred in Nepal, was Bihar- Nepal earthquake" +
                " of 1934 A.D. Assam great earthquake of 1897, Kangra earthquake 1905, and Assam earthquake 1950 were felt " +
                "in Nepal. The earthquake of 1833 also affected the Kathmandu Valley. The record of historical earthquake is " +
                "not complete which poses a problem in assessing the recurrence period of great earthquakes. From the available" +
                " data there has been no great earthquakes of magnitude >8.0 in the gap between the earthquakes of 1905 A.D " +
                "and 1934 A.D. and there is a real threat that a major earthquake may occur in this gap that will affect " +
                "Western Nepal. \n \n \n Thank you!!";

            stringBuilder.append(someMessage);

        mMessagewindow.setText(stringBuilder.toString());

    }
}
