package pe.edu.ulima.fragmentsapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

import pe.edu.ulima.fragmentsapp.fragments.MenuFragment;


public class MainActivity extends ActionBarActivity
        implements MenuFragment.OnMenuSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onMenuSelected(int menuId) {
        // Codigo a ejecutar al hacer click en el boton
        String opc = "";
        if (menuId == R.id.butUno){
            opc = "1";
        }else if (menuId == R.id.butDos){
            opc = "2";
        }else{
            opc = "3";
        }
        Toast.makeText(this, "Opc " + opc, Toast.LENGTH_SHORT).show();
    }
}
