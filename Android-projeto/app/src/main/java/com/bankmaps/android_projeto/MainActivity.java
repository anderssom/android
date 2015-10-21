package com.bankmaps.android_projeto;

<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> origin/master
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


<<<<<<< HEAD
    public String[] libsNome = new String[]{"Android easy cache", "Simple Disk Cache", "Android-BitmapCache", "Qachee"};
=======
    public String[] libsNome = new String[]{"Android easy cache", "Simple Disk Cache", "Android-BitmapCache"};
>>>>>>> origin/master
    public int img[] = {R.drawable.ferrari, R.drawable.ferrari, R.drawable.ferrari};

    private Spinner sp;
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item, libsNome);
        adapter.setDropDownViewResource(android.R.layout.simple_selectable_list_item);

        iv = (ImageView) findViewById(R.id.imageView);

        sp = (Spinner) findViewById(R.id.spinner);
        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                iv.setImageResource(img[position]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void showElemento (View view) {
        String nome = (String) sp.getSelectedItem();
        long id = sp.getSelectedItemId();
        int posicao = sp.getSelectedItemPosition();

<<<<<<< HEAD
        if(sp.getSelectedItemId()==0){
            Intent intent =  new Intent(this, SettingsEasyCache.class);
            startActivity(intent);
            Toast.makeText(this, "Lib: " + nome, Toast.LENGTH_SHORT).show();
        }
//        Toast.makeText(this, "Lib: " + nome, Toast.LENGTH_SHORT).show();
=======
        Toast.makeText(this, "Lib: " + nome, Toast.LENGTH_SHORT).show();
>>>>>>> origin/master

    }

}
