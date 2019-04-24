package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment  implements View.OnClickListener{

    private Button btncalculate;
    private EditText etfirst, etsecond;
    private TextView tvresult;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view= inflater.inflate(R.layout.fragment_first, container, false);

         etfirst=view.findViewById(R.id.etfirst);
         etsecond=view.findViewById(R.id.etsecond);
         btncalculate=view.findViewById(R.id.btncalculate);
         tvresult=view.findViewById(R.id.tvresult);


         btncalculate.setOnClickListener(this);
         return view;

    }

    @Override
    public void onClick(View v) {

        int first= Integer.parseInt(etfirst.getText().toString());
        int second=Integer.parseInt(etsecond.getText().toString());

        int result = first + second;


        tvresult.setText(Integer.toString(result));

        Toast.makeText(getActivity(),"Sum is: "+ result, Toast.LENGTH_SHORT).show();

    }
}
