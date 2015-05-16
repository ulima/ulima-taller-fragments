package pe.edu.ulima.fragmentsapp.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import pe.edu.ulima.fragmentsapp.R;

/**
 * Created by hquintana on 16/05/15.
 */
public class MenuFragment extends Fragment implements View.OnClickListener{
    OnMenuSelectedListener listener;
    Button butUno, butDos, butTres;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        listener = (OnMenuSelectedListener) activity;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        butUno = (Button) getView().findViewById(R.id.butUno);
        butDos = (Button) getView().findViewById(R.id.butDos);
        butTres = (Button) getView().findViewById(R.id.butTres);

        butUno.setOnClickListener(this);
        butDos.setOnClickListener(this);
        butTres.setOnClickListener(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu, null);
    }

    @Override
    public void onClick(View view) {
        listener.onMenuSelected(view.getId());
    }

    public interface OnMenuSelectedListener{
        public void onMenuSelected(int menuId);
    }
}






