package alvi17.bangladeshconstitution;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.HashMap;
import java.util.List;

/**
 * Created by User on 8/1/2017.
 */

public class Details_SectionActivity extends AppCompatActivity{

    TextView section,subsection,paragraph;

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, String> listDataChild;
    String section_text,subsection_text;
    int section_num,subsection_num;

    String[] headers,childs;
    private InterstitialAd interstitial;
    AdView adView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_layout);


        section=(TextView)findViewById(R.id.section_textView);
        subsection=(TextView)findViewById(R.id.subsection_textView);
        section_text=getIntent().getStringExtra("Section_Title");
        subsection_text=getIntent().getStringExtra("SubSection_Title");
        section.setText(section_text.replace("\n",":\t"));
        subsection.setText(subsection_text.replace("\n",":\t"));
        if(subsection_text.equals("")){
            subsection.setVisibility(View.GONE);
        }


        section_num=getIntent().getIntExtra("Section",0);
        subsection_num=getIntent().getIntExtra("SubSection",0);

        if(section_num==1){
            headers=getResources().getStringArray(R.array.first_section);
            childs=getResources().getStringArray(R.array.first_section_details);
        }
        else if(section_num==2)
        {
            headers=getResources().getStringArray(R.array.second_section);
            childs=getResources().getStringArray(R.array.second_section_details);

        }
        else if(section_num==3)
        {
            headers=getResources().getStringArray(R.array.third_section);
            childs=getResources().getStringArray(R.array.third_section_details);

        }
        else if(section_num==4)
        {
            if(subsection_num==1) {
                headers = getResources().getStringArray(R.array.fourth_section_first);
                childs = getResources().getStringArray(R.array.fourth_section_first_details);
            }
            else if(subsection_num==2)
            {
                headers = getResources().getStringArray(R.array.fourth_section_second);
                childs = getResources().getStringArray(R.array.fourth_section_second_details);
            }
            else if(subsection_num==3)
            {
                headers = getResources().getStringArray(R.array.fouth_section_third);
                childs = getResources().getStringArray(R.array.fourth_section_third_details);
            }
            else if(subsection_num==4)
            {
                headers = getResources().getStringArray(R.array.fourth_section_fourth);
                childs = getResources().getStringArray(R.array.fourth_section_fourth_details);
            }
            else if(subsection_num==5)
            {
                headers = getResources().getStringArray(R.array.fourth_section_fifth);
                childs = getResources().getStringArray(R.array.fourth_section_fifth_details);
            }

        }
        else if(section_num==5)
        {
            if(subsection_num==1)
            {
                headers = getResources().getStringArray(R.array.fifth_section_first);
                childs = getResources().getStringArray(R.array.fifth_section_first_details);
            }
            else if(subsection_num==2)
            {
                headers = getResources().getStringArray(R.array.fifth_section_second);
                childs = getResources().getStringArray(R.array.fifth_section_second_details);
            }
            else if(subsection_num==3)
            {
                headers = getResources().getStringArray(R.array.fifth_section_third);
                childs = getResources().getStringArray(R.array.fifth_section_third_details);
            }

        }
        else if(section_num==6)
        {
            if(subsection_num==1)
            {
                headers = getResources().getStringArray(R.array.sixth_section_first);
                childs = getResources().getStringArray(R.array.sixth_section_first_details);
            }
            else if(subsection_num==2)
            {
                headers = getResources().getStringArray(R.array.sixth_section_second);
                childs = getResources().getStringArray(R.array.sixth_section_second_details);
            }
            else if(subsection_num==3)
            {
                headers = getResources().getStringArray(R.array.sixth_section_third);
                childs = getResources().getStringArray(R.array.sixth_section_third_details);
            }
        }
        else if(section_num==7)
        {
            headers = getResources().getStringArray(R.array.seventh_section);
            childs = getResources().getStringArray(R.array.seventh_section_details);
        }
        else if(section_num==8)
        {
            headers = getResources().getStringArray(R.array.eigth_section);
            childs = getResources().getStringArray(R.array.eigth_section_details);
        }
        else if(section_num==9)
        {
            if(subsection_num==1)
            {
                headers = getResources().getStringArray(R.array.ninth_section_first);
                childs = getResources().getStringArray(R.array.ninth_section_first_details);
            }
            else if(subsection_num==2)
            {
                headers = getResources().getStringArray(R.array.ninth_section_second);
                childs = getResources().getStringArray(R.array.ninth_section_second_details);
            }
        }
        else if(section_num==91)
        {
            headers = getResources().getStringArray(R.array.ninth_section_a);
            childs = getResources().getStringArray(R.array.ninth_section_a_details);
        }
        else if(section_num==10)
        {
            headers = getResources().getStringArray(R.array.tenth_section);
            childs = getResources().getStringArray(R.array.tenth_section_details);
        }
        else {
            headers = getResources().getStringArray(R.array.eleventh_section);
            childs = getResources().getStringArray(R.array.eleventh_section_details);
        }

        expListView = (ExpandableListView) findViewById(R.id.expandableListView);
        listAdapter = new ExpandaleListAdapter(this, headers,childs);

        // setting list adapter
        expListView.setAdapter(listAdapter);
        String s= "";




            interstitial = new InterstitialAd(this);
            interstitial.setAdUnitId("ca-app-pub-6508526601344465/3572571593");
            AdRequest aRequest = new AdRequest.Builder().build();
        if(Util.full_screen%2==0) {
            // Begin loading your interstitial.
            interstitial.loadAd(aRequest);

            interstitial.setAdListener(
                    new AdListener() {
                        @Override
                        public void onAdLoaded() {
                            super.onAdLoaded();
                            interstitial.show();
                        }
                    }
            );
        }

        Util.full_screen++;

        adView = (AdView) findViewById(R.id.detailsadView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("0754C239B1E2E19421FDE46BCEFB8855")
                .build();
        adView.loadAd(adRequest);
    }





}
