package tec.ispc.workflix.views.ui.dashboard_admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import tec.ispc.workflix.R;
import tec.ispc.workflix.views.MainActivity;

public class DashboardAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_admin);
    }

    /*public void irInicio(View view) {
        Intent inicioIntent = new Intent(this, MainActivity.class);
        startActivity(inicioIntent);
    }
    public void verUsuarios(View view){
        Intent verIntent = new Intent(this, DashboardActivity.class);
        startActivity(verIntent);
    }*/
}
