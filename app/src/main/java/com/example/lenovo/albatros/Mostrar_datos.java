package com.example.lenovo.albatros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;

public class Mostrar_datos extends AppCompatActivity implements View.OnClickListener {
String nombre,origen_completo,destino_completo,fecha,asiento,corrida,status="0",hora,origen,destino,oficina="APP",camion;
    TextView nombretxt,origentxt,destinotxt,fechatxt,asientotxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        origen_completo=getIntent().getStringExtra("origen_completo");
        destino_completo=getIntent().getStringExtra("destino_completo");
        fecha=getIntent().getStringExtra("fecha");
        nombre=getIntent().getStringExtra("nombre_completo");
        asiento=getIntent().getStringExtra("asiento");
        corrida=getIntent().getStringExtra("corrida");
        hora=getIntent().getStringExtra("hora");
        origen=getIntent().getStringExtra("origen");
        destino=getIntent().getStringExtra("destino");
        camion=getIntent().getStringExtra("camion");

        nombretxt =(TextView) findViewById(R.id.txt_nombre);
        origentxt=(TextView) findViewById(R.id.txt_origen);
        destinotxt=(TextView) findViewById(R.id.txt_destino);
        fechatxt=(TextView) findViewById(R.id.txt_fecha);
        asientotxt=(TextView) findViewById(R.id.txt_asiento);
        nombretxt.setText(nombre);
        origentxt.setText(origen_completo);
        destinotxt.setText(destino_completo);
        fechatxt.setText(fecha);
        asientotxt.setText(asiento);

    }

    public void ObtDatos(){
        AsyncHttpClient client = new AsyncHttpClient();
        String url="http://www.albatrosmexico.com/jesus/insert_boletos.php";
        RequestParams parametros = new RequestParams();
        parametros.put("fecha",fecha);
        parametros.put("corrida",corrida);
        parametros.put("asiento",asiento);
        parametros.put("origen",origen);
        parametros.put("destino",destino);
        parametros.put("hora",hora);
        parametros.put("nombre",nombre);
        parametros.put("status",status);
        parametros.put("oficina",oficina);
        parametros.put("camion",camion);

        client.post(url, parametros, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {


                //Toast.makeText(getApplicationContext(), destino, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }
    @Override
    public void onClick(View v) {
      ObtDatos();
        Intent i = new Intent(Mostrar_datos.this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
