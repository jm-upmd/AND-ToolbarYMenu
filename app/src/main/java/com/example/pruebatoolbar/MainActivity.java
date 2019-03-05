/*
1. Modificar estilo del Theme usado para que no use uno se los que añaden una actionbar
    Ver Theme  AppTheme declarado en styles.xml
2. Crear el toolbar (preferiblemente en layaut aparte y luego incluir en principal).
    Ver toolbar.xml
3. Dotar al toolbar de las capacidades de una actionbar. Esto se hace  con setSupportActionBar(toolbar)
    Para utilizar las capacidades de la actionbar utilizar getSupportActionBar() que devuelve
    objeto actionbar.
4. Agregar menú a la toolbar.
    - Crear recurso xml menu.
    - Implementar métodos callback onCreateOptionsMenu() y onOptionsItemSelected()
 */

package com.example.pruebatoolbar;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);  //Da soporte de actionbar

        // Algunas de las cosas que se pueden hacer con actionbar.
        getSupportActionBar().setTitle("Título");

        //getSupportActionBar().hide();  // ocultar toolbar

        //getSupportActionBar().show(); // mostrar toolbar


        // Pinta sombra
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setElevation(10.0f);
        }

        // Algunas cosas que se pueden hacer con toolbar
        toolbar.setSubtitle("Subtítulo");
        //toolbar.setLogo(R.drawable.ic_action_logo);  // logo de la imagen
        //toolbar.setNavigationIcon(R.drawable.ic_action_back);  // flecha hacia atrás



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String mensaje=null;
        switch (item.getItemId()){
            case  R.id.borrar:

            case R.id.buscar:

            case R.id.editar:

            case R.id.preferencias:
                    mensaje="Pulsado... " + item.getTitle();
                break;
            case R.id.salir:
                finish();
                break;
        }
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();


        return super.onOptionsItemSelected(item);
    }
}
