package alvi17.bangladeshconstitution;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.NativeExpressAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Bangla_Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Bangla_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Bangla_Fragment extends Fragment implements View.OnClickListener{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Bangla_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Bangla_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Bangla_Fragment newInstance(String param1, String param2) {
        Bangla_Fragment fragment = new Bangla_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    TextView prefaceTextView,prefacedetailsTextView;
    LinearLayout section1,section2,section3,section4,section5,section6,section7,section8,section9,section91,section10,section11;

    TextView section4_subsection1,section4_subsection2,section4_subsection3,section4_subsection4,section4_subsection5,
            section5_subsection1,section5_subsection2,section5_subsection3,
            section6_subsection1,section6_subsection2,section6_subsection3,
            ninth_subsection1,ninth_subsection2;

    LinearLayout subsection4,subsection5,subsection6,subsection9,subsection9_a;

    NativeExpressAdView native_adView;
    VideoController mVideoController;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_bangla_, container, false);
        prefaceTextView=(TextView)rootView.findViewById(R.id.prefacetextView);
        prefaceTextView.setOnClickListener(this);

        prefacedetailsTextView=(TextView)rootView.findViewById(R.id.preface_details_textView);
        prefacedetailsTextView.setText(prefacedetailsTextView.getText().toString().replace("+",""));

        section1=(LinearLayout)rootView.findViewById(R.id.first_section);
        section1.setOnClickListener(this);
        section2=(LinearLayout)rootView.findViewById(R.id.second_section);
        section2.setOnClickListener(this);
        section3=(LinearLayout)rootView.findViewById(R.id.third_section);
        section3.setOnClickListener(this);
        section4=(LinearLayout)rootView.findViewById(R.id.fourth_section);
        section4.setOnClickListener(this);
        section5=(LinearLayout)rootView.findViewById(R.id.fifth_section);
        section5.setOnClickListener(this);
        section6=(LinearLayout)rootView.findViewById(R.id.sixth_section);
        section6.setOnClickListener(this);
        section7=(LinearLayout)rootView.findViewById(R.id.seventh_section);
        section7.setOnClickListener(this);
        section8=(LinearLayout)rootView.findViewById(R.id.eight_section);
        section8.setOnClickListener(this);
        section9=(LinearLayout)rootView.findViewById(R.id.nineth_section);
        section9.setOnClickListener(this);
        section10=(LinearLayout)rootView.findViewById(R.id.tenth_section);
        section10.setOnClickListener(this);
        section11=(LinearLayout)rootView.findViewById(R.id.eleventh_section);
        section11.setOnClickListener(this);
        section91=(LinearLayout)rootView.findViewById(R.id.ninth_a_subsection);
        section91.setOnClickListener(this);

        subsection4=(LinearLayout)rootView.findViewById(R.id.fourth_subsection_layout);
        subsection5=(LinearLayout)rootView.findViewById(R.id.fifthsubsection_layout);
        subsection6=(LinearLayout)rootView.findViewById(R.id.sixth_subsection);
        subsection9=(LinearLayout)rootView.findViewById(R.id.ninth_subsection);
        subsection9_a=(LinearLayout)rootView.findViewById(R.id.ninth_a_subsection);

        section4_subsection1=(TextView)rootView.findViewById(R.id.fourth_first_chapter);
        section4_subsection1.setOnClickListener(this);
        section4_subsection2=(TextView)rootView.findViewById(R.id.fourth_second_chapter);
        section4_subsection2.setOnClickListener(this);
        section4_subsection3=(TextView)rootView.findViewById(R.id.fourth_third_chapter);
        section4_subsection3.setOnClickListener(this);
        section4_subsection4=(TextView)rootView.findViewById(R.id.fourth_fourth_chapter);
        section4_subsection4.setOnClickListener(this);
        section4_subsection5=(TextView)rootView.findViewById(R.id.fourth_fifth_chapter);
        section4_subsection5.setOnClickListener(this);


        section5_subsection1=(TextView)rootView.findViewById(R.id.fifth_first_chapter);
        section5_subsection1.setOnClickListener(this);
        section5_subsection2=(TextView)rootView.findViewById(R.id.fifth_second_chapter);
        section4_subsection2.setOnClickListener(this);
        section5_subsection3=(TextView)rootView.findViewById(R.id.fifth_third_chapter);
        section5_subsection3.setOnClickListener(this);


        section6_subsection1=(TextView)rootView.findViewById(R.id.sixth_first_chapter);
        section6_subsection1.setOnClickListener(this);
        section6_subsection2=(TextView)rootView.findViewById(R.id.sixth_second_chapter);
        section6_subsection2.setOnClickListener(this);
        section6_subsection3=(TextView)rootView.findViewById(R.id.sixth_three_chapter);
        section6_subsection2.setOnClickListener(this);

        ninth_subsection1=(TextView)rootView.findViewById(R.id.ninth_first_chapter);
        ninth_subsection1.setOnClickListener(this);
        ninth_subsection2=(TextView)rootView.findViewById(R.id.ninth_second_chapter);
        ninth_subsection2.setOnClickListener(this);



        AdView adView = (AdView) rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("0754C239B1E2E19421FDE46BCEFB8855").build();
        adView.loadAd(adRequest);

        return rootView;

    }

    @Override
    public void onResume() {
        super.onResume();

    }

    int preface=0;
    int section_4=0;
    int section_5=0,section_6=0,section_9=0;
    @Override
    public void onClick(View v) {
        Intent intent;
        int id=v.getId();

        switch (id)
        {
            case R.id.prefacetextView:
                if(preface%2==0)
                {
                    prefaceTextView.setBackgroundColor(Color.argb(255,10,100,100));
                    prefacedetailsTextView.setVisibility(View.VISIBLE);
                }
                else
                {
                    prefaceTextView.setBackgroundResource(R.drawable.normal_state_background);
                    prefacedetailsTextView.setVisibility(View.GONE);
                }
                preface++;
                break;
            case R.id.first_section:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",1);
                intent.putExtra("SubSection",0);
                intent.putExtra("Section_Title","প্রথম ভাগ\n" +
                        "প্রজাতন্ত্র");
                intent.putExtra("SubSection_Title","");
                startActivity(intent);
                break;
            case R.id.second_section:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",2);
                intent.putExtra("SubSection",0);
                intent.putExtra("Section_Title","দ্বিতীয় ভাগ\n" +
                        "রাষ্ট্র পরিচালনার মূলনীতি");
                intent.putExtra("SubSection_Title","");
                startActivity(intent);
                break;
            case R.id.third_section:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",3);
                intent.putExtra("SubSection",0);
                intent.putExtra("Section_Title","তৃতীয় ভাগ\n" +
                        "মৌলিক অধিকার");
                intent.putExtra("SubSection_Title","");
                startActivity(intent);
                break;
            case R.id.fourth_section:
                if(section_4%2==0) {
                    subsection4.setVisibility(View.VISIBLE);
                }else
                {
                    subsection4.setVisibility(View.GONE);
                }
                section_4++;
                break;
            case R.id.fourth_first_chapter:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",4);
                intent.putExtra("SubSection",1);
                intent.putExtra("Section_Title","চতুর্থ ভাগ\n" +
                        "নির্বাহী বিভাগ");
                intent.putExtra("SubSection_Title"," [৪] ১ম পরিচ্ছেদ\n" +
                        "রাষ্ট্রপতি");
                startActivity(intent);
                break;
            case R.id.fourth_second_chapter:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",4);
                intent.putExtra("SubSection",2);
                intent.putExtra("Section_Title","চতুর্থ ভাগ\n" +
                        "নির্বাহী বিভাগ");
                intent.putExtra("SubSection_Title","২য় পরিচ্ছেদ\n" +
                        "প্রধানমন্ত্রী ও মন্ত্রিসভা");
                startActivity(intent);
                break;
            case R.id.fourth_third_chapter:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",4);
                intent.putExtra("SubSection",3);
                intent.putExtra("Section_Title","চতুর্থ ভাগ\n" +
                        "নির্বাহী বিভাগ");
                intent.putExtra("SubSection_Title","৩য় পরিচ্ছেদ\n" +
                        "স্থানীয় শাসন");
                startActivity(intent);
                break;
            case R.id.fourth_fourth_chapter:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",4);
                intent.putExtra("SubSection",4);
                intent.putExtra("Section_Title","চতুর্থ ভাগ\n" +
                        "নির্বাহী বিভাগ");
                intent.putExtra("SubSection_Title","৪র্থ পরিচ্ছেদ\n" +
                        "প্রতিরক্ষা কর্মবিভাগ");
                startActivity(intent);
                break;
            case R.id.fourth_fifth_chapter:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",4);
                intent.putExtra("SubSection",5);
                intent.putExtra("Section_Title","চতুর্থ ভাগ\n" +
                        "নির্বাহী বিভাগ");
                intent.putExtra("SubSection_Title","৫ম পরিচ্ছেদ\n" +
                        "অ্যাটর্ণি -জেনারেল");
                startActivity(intent);
                break;
            case R.id.fifth_section:
                if(section_5%2==0){
                    subsection5.setVisibility(View.VISIBLE);
                }
                else{
                    subsection5.setVisibility(View.GONE);
                }
                section_5++;
                break;
            case R.id.fifth_first_chapter:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",5);
                intent.putExtra("SubSection",1);
                intent.putExtra("Section_Title","পঞ্চম ভাগ\n" +
                        "আইনসভা");
                intent.putExtra("SubSection_Title","১ম পরিচ্ছেদ\n" +
                        "সংসদ");
                startActivity(intent);
                break;
            case R.id.fifth_second_chapter:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",5);
                intent.putExtra("SubSection",2);
                intent.putExtra("Section_Title","পঞ্চম ভাগ\n" +
                        "আইনসভা");
                intent.putExtra("SubSection_Title","২য় পরিচ্ছেদ\n" +
                        "আইন প্রনয়ন ও অর্থসংক্রান্ত পদ্ধতি");
                startActivity(intent);
                break;
            case R.id.fifth_third_chapter:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",5);
                intent.putExtra("SubSection",3);
                intent.putExtra("Section_Title","পঞ্চম ভাগ\n" +
                        "আইনসভা");
                intent.putExtra("SubSection_Title","৩য় পরিচ্ছেদ\n" +
                        "অধ্যাদেশপ্রণয়ন-ক্ষমতা");
                startActivity(intent);
                break;
            case R.id.sixth_section:
                if(section_6%2==0){
                    subsection6.setVisibility(View.VISIBLE);
                }
                else
                {
                    subsection6.setVisibility(View.GONE);
                }
                section_6++;
                break;
            case R.id.sixth_first_chapter:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",6);
                intent.putExtra("SubSection",1);
                intent.putExtra("Section_Title","ষষ্ঠ ভাগ\n" +
                        "বিচারবিভাগ");
                intent.putExtra("SubSection_Title","১ম পরিচ্ছেদ\n" +
                        "সুপ্রীম কোর্ট");
                startActivity(intent);
                break;
            case R.id.sixth_second_chapter:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",6);
                intent.putExtra("SubSection",2);
                intent.putExtra("Section_Title","ষষ্ঠ ভাগ\n" +
                        "বিচারবিভাগ");
                intent.putExtra("SubSection_Title","২য় পরিচ্ছেদ\n" +
                        "অধস্তন আদালত");
                startActivity(intent);
                break;
            case R.id.sixth_three_chapter:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",6);
                intent.putExtra("SubSection",3);
                intent.putExtra("Section_Title","ষষ্ঠ ভাগ\n" +
                        "বিচারবিভাগ");
                intent.putExtra("SubSection_Title","৩য় পরিচ্ছেদ\n" +
                        "প্রশাসনিক ট্রাইব্যুনাল");
                startActivity(intent);
                break;
            case R.id.seventh_section:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",7);
                intent.putExtra("SubSection",0);
                intent.putExtra("Section_Title","সপ্তম ভাগ\n" +
                        "নির্বাচন");
                intent.putExtra("SubSection_Title","");
                startActivity(intent);
                break;
            case R.id.eight_section:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",8);
                intent.putExtra("SubSection",0);
                intent.putExtra("Section_Title","অষ্টম ভাগ\n" +
                        "মহা হিসাব-নিরীক্ষক ও নিয়ন্ত্রক");
                intent.putExtra("SubSection_Title","");
                startActivity(intent);
                break;
            case R.id.nineth_section:
                if(section_9%2==0)
                {
                    subsection9.setVisibility(View.VISIBLE);
                }
                else
                {
                    subsection9.setVisibility(View.GONE);
                }
                section_9++;
                break;
            case R.id.ninth_first_chapter:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",9);
                intent.putExtra("SubSection",1);
                intent.putExtra("Section_Title","নবম ভাগ\n" +
                        "বাংলাদেশের কর্মবিভাগ");
                intent.putExtra("SubSection_Title","১ম পরিচ্ছেদ\n" +
                        "কর্মবিভাগ");
                startActivity(intent);
                break;
            case R.id.ninth_second_chapter:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",9);
                intent.putExtra("SubSection",2);
                intent.putExtra("Section_Title","নবম ভাগ\n" +
                        "বাংলাদেশের কর্মবিভাগ");
                intent.putExtra("SubSection_Title","২য় পরিচ্ছেদ\n" +
                        "সরকারী কর্ম কমিশন");
                startActivity(intent);
                break;
            case R.id.ninth_a_subsection:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",91);
                intent.putExtra("SubSection",0);
                intent.putExtra("Section_Title"," [৫] নবম-ক ভাগ\n" +
                        "জরুরী বিধানাবলী");
                intent.putExtra("SubSection_Title","");
                startActivity(intent);
                break;
            case R.id.tenth_section:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",10);
                intent.putExtra("SubSection",0);
                intent.putExtra("Section_Title"," দশম ভাগ\n" +
                        "সংবিধান-সংশোধন");
                intent.putExtra("SubSection_Title","");
                startActivity(intent);
                break;
            case R.id.eleventh_section:
                intent=new Intent(getActivity(),Details_SectionActivity.class);
                intent.putExtra("Section",11);
                intent.putExtra("SubSection",0);
                intent.putExtra("Section_Title","একাদশ ভাগ\n" +
                        "বিবিধ");
                intent.putExtra("SubSection_Title","");
                startActivity(intent);
                break;

        }
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
//        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
