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
public class SIFragment extends Fragment implements View.OnClickListener {

    private Button btnsi;
    private EditText etprincipal, ettime, etrate, etres;



    public SIFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_si, container, false);

        etprincipal = view.findViewById(R.id.etprincipal);
        ettime = view.findViewById(R.id.ettime);
        etrate = view.findViewById(R.id.etrate);
        btnsi = view.findViewById(R.id.btnsi);
        etres = view.findViewById(R.id.etres);

        btnsi.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        float p = Float.parseFloat(etprincipal.getText().toString());
        float t = Float.parseFloat(ettime.getText().toString());
        float r = Float.parseFloat(etrate.getText().toString());

        float result = (p * t * r)/100;

        etres.setText(Float.toString(result));

        Toast.makeText(getActivity(),"Simple Interest is "+result,Toast.LENGTH_SHORT).show();

    }
}
