package com.example.lenovo.albatros;

import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class asiento extends AppCompatActivity implements View.OnClickListener {
   String valores;
    String origen;
    ImageView asiento1,asiento2,asiento3,asiento4,asiento5,asiento6,asiento7,asiento8,asiento9,
            asiento10,asiento11,asiento12,asiento13,asiento14,asiento15,asiento16,asiento17,asiento18,
            asiento19,asiento20,asiento21,asiento22,asiento23,asiento24,asiento25,asiento26,asiento27,asiento28,asiento29
            ,asiento30,asiento31,asiento32,asiento33,asiento34,asiento35,asiento36,asiento37,asiento38,asiento39,asiento40;
    String destino;
    boolean temp1=true,temp2=true,temp3=true,temp4=true,temp5=true,temp6=true,temp7=true,temp8=true,temp9=true
            ,temp10=true,temp11=true,temp12=true,temp13=true,temp14=true,temp15=true
            ,temp16=true,temp17=true,temp18=true,temp19=true,temp20=true,temp21=true,temp22=true,temp23=true
            ,temp24=true,temp25=true,temp26=true,temp27=true,temp28=true,temp29=true,temp30=true,temp31=true
            ,temp32=true,temp33=true,temp34=true,temp35=true,temp36=true,temp37=true,temp38=true,temp39=true,temp40=true;
    String corrida;
    boolean boton=true;
    String fecha,origen_completo,destino_completo;
    String asiento;
    String hora;
    String nombre_completo;
    EditText nombre;
   String temp;
    String camion;
    Spinner lista_asientos;
    String [] asientos={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19",
            "20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asiento);

       // valores= getIntent().getStringExtra("valores");
        origen=getIntent().getStringExtra("origen");
        destino=getIntent().getStringExtra("destino");
        corrida=getIntent().getStringExtra("corrida");
        fecha=getIntent().getStringExtra("fecha");
        hora=getIntent().getStringExtra("hora");
        camion=getIntent().getStringExtra("camion");
        origen_completo=getIntent().getStringExtra("origen_completo");
        destino_completo=getIntent().getStringExtra("destino_completo");
        nombre=(EditText) findViewById(R.id.edt_nombre);
        nombre_completo=nombre.getText().toString();
       // Toast.makeText(getApplicationContext(), destino+" "+corrida+" "+fecha, Toast.LENGTH_SHORT).show();
        lista_asientos=(Spinner) findViewById(R.id.spinner_asientos);

        ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,asientos);
        lista_asientos.setAdapter(adaptador);
        lista_asientos.setAdapter(adaptador);

        lista_asientos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        if (temp1==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp1==true){
                            asiento="1";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 1:
                        if (temp2==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp2==true){
                            asiento="2";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 2:
                        if (temp3==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp3==true){
                            asiento="3";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 3:
                        if (temp4==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp4==true){
                            asiento="4";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 4:
                        if (temp5==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp5==true){
                            asiento="5";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 5:
                        if (temp6==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp6==true){
                            asiento="6";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 6:
                        if (temp7==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp7==true){
                            asiento="7";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 7:
                        if (temp8==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp8==true){
                            asiento="8";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 8:
                        if (temp9==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp9==true){
                            asiento="9";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 9:
                        if (temp10==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp10==true){
                            asiento="10";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 10:
                        if (temp11==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp11==true){
                            asiento="11";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 11:
                        if (temp12==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp12==true){
                            asiento="12";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 12:
                        if (temp13==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp13==true){
                            asiento="13";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 13:
                        if (temp14==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp14==true){
                            asiento="14";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 14:
                        if (temp15==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp15==true){
                            asiento="15";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 15:
                        if (temp16==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp16==true){
                            asiento="16";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 16:
                        if (temp17==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp17==true){
                            asiento="17";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 17:
                        if (temp18==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp18==true){
                            asiento="18";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 18:
                        if (temp19==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp19==true){
                            asiento="19";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 19:
                        if (temp20==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp20==true){
                            asiento="20";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 20:
                        if (temp21==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp21==true){
                            asiento="21";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 21:
                        if (temp22==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp22==true){
                            asiento="22";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 22:
                        if (temp23==false){
                        Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                    }
                        if (temp23==true){
                            asiento="23";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 23:
                        if (temp24==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp24==true){
                            asiento="24";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 24:
                        if (temp25==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp25==true){
                            asiento="25";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 25:
                        if (temp26==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp26==true){
                            asiento="26";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 26:
                        if (temp27==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp27==true){
                            asiento="27";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 27:
                        if (temp28==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp28==true){
                            asiento="28";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 28:
                        if (temp29==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp29==true){
                            asiento="29";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 29:
                        if (temp30==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp30==true){
                            asiento="30";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 30:
                        if (temp31==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp31==true){
                            asiento="31";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 31:
                        if (temp32==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp32==true){
                            asiento="32";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 32:
                        if (temp33==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp33==true){
                            asiento="33";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 33:
                        if (temp34==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp34==true){
                            asiento="34";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 34:
                        if (temp35==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp35==true){
                            asiento="35";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 35:
                        if (temp36==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp36==true){
                            asiento="36";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 36:
                        if (temp37==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp37==true){
                            asiento="37";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 37:
                        if (temp38==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp38==true){
                            asiento="38";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 38:
                        if (temp39==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp39==true){
                            asiento="39";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;
                    case 39:
                        if (temp40==false){
                            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
                            boton=false;
                        }
                        if (temp40==true){
                            asiento="40";
                            Intent i = new Intent(asiento.this, Mostrar_datos.class);
                            i.putExtra("origen_completo",origen_completo);
                            i.putExtra("destino_completo",destino_completo);
                            i.putExtra("fecha",fecha);
                            i.putExtra("nombre_completo",nombre_completo);
                            i.putExtra("asiento",asiento);
                            boton=true;
                        }
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ObtDatos();


    }

   public void ObtDatos(){
       AsyncHttpClient client = new AsyncHttpClient();
       String url="http://www.albatrosmexico.com/jesus/consulta_boletos.php";
       RequestParams parametros = new RequestParams();
       parametros.put("origen",origen);
       parametros.put("corrida",corrida);
       parametros.put("fecha",fecha);

       client.post(url, parametros, new AsyncHttpResponseHandler() {
           @Override
           public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

                    obtDatosJSON(new String (responseBody));
                   //Toast.makeText(getApplicationContext(), destino, Toast.LENGTH_SHORT).show();

           }

           @Override
           public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

           }
       });
    }
        public void obtDatosJSON(String response){
            try{

                JSONArray jsonArray= new JSONArray(response);
                    for (int i=0;i<jsonArray.length();i++){
                        if ((jsonArray.getJSONObject(i).getInt("asiento"))==(1)){
                            asiento1= (ImageView) findViewById(R.id.asiento1);
                            asiento1.setImageResource(R.mipmap.asiento_red1);
                            temp1=false;
                        }
                        if ((jsonArray.getJSONObject(i).getInt("asiento"))==(2)){
                            asiento2= (ImageView) findViewById(R.id.asiento2);
                            asiento2.setImageResource(R.mipmap.asiento_red2);
                                temp2=false;
                        }
                        if ((jsonArray.getJSONObject(i).getInt("asiento"))==(3)){
                            asiento3= (ImageView) findViewById(R.id.asiento3);
                            asiento3.setImageResource(R.mipmap.asiento_red3);
                            temp3=false;
                        }
                        if ((jsonArray.getJSONObject(i).getInt("asiento"))==(4)){
                            asiento4= (ImageView) findViewById(R.id.asiento4);
                            asiento4.setImageResource(R.mipmap.asiento_red4);
                            temp4=false;
                        }
                        if ((jsonArray.getJSONObject(i).getInt("asiento"))==(5)){
                            asiento5= (ImageView) findViewById(R.id.asiento5);
                            asiento5.setImageResource(R.mipmap.asiento_red5);
                            temp5=false;
                        }
                        if ((jsonArray.getJSONObject(i).getInt("asiento"))==(6)){
                            asiento6= (ImageView) findViewById(R.id.asiento6);
                            asiento6.setImageResource(R.mipmap.asiento_red6);
                            temp6=false;
                        }
                        if ((jsonArray.getJSONObject(i).getInt("asiento"))==(7)){
                            asiento7= (ImageView) findViewById(R.id.asiento7);
                            asiento7.setImageResource(R.mipmap.asiento_red7);
                            temp7=false;
                        }
                        if ((jsonArray.getJSONObject(i).getInt("asiento"))==(8)){
                            asiento8= (ImageView) findViewById(R.id.asiento8);
                            asiento8.setImageResource(R.mipmap.asiento_red8);
                            temp8=false;
                        }
                        if ((jsonArray.getJSONObject(i).getInt("asiento"))==(9)){
                            asiento9= (ImageView) findViewById(R.id.asiento9);
                            asiento9.setImageResource(R.mipmap.asiento_red9);
                            temp9=false;
                        }
                        if ((jsonArray.getJSONObject(i).getInt("asiento"))==(10)){
                            asiento10= (ImageView) findViewById(R.id.asiento10);
                            asiento10.setImageResource(R.mipmap.asiento_red10);
                            temp10=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(11)){
                            asiento11= (ImageView) findViewById(R.id.asiento11);
                            asiento11.setImageResource(R.mipmap.asiento_red11);
                            temp11=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(12)){
                            asiento12= (ImageView) findViewById(R.id.asiento12);
                            asiento12.setImageResource(R.mipmap.asiento_red12);
                            temp12=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(13)){
                            asiento13= (ImageView) findViewById(R.id.asiento13);
                            asiento13.setImageResource(R.mipmap.asiento_red13);
                            temp13=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(14)){
                            asiento14= (ImageView) findViewById(R.id.asiento14);
                            asiento14.setImageResource(R.mipmap.asiento_red14);
                            temp14=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(15)){
                            asiento15= (ImageView) findViewById(R.id.asiento15);
                            asiento15.setImageResource(R.mipmap.asiento_red15);
                            temp15=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(16)){
                            asiento16= (ImageView) findViewById(R.id.asiento16);
                            asiento16.setImageResource(R.mipmap.asiento_red16);
                            temp16=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(17)){
                            asiento17= (ImageView) findViewById(R.id.asiento17);
                            asiento17.setImageResource(R.mipmap.asiento_red17);
                            temp17=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(18)){
                            asiento18= (ImageView) findViewById(R.id.asiento18);
                            asiento18.setImageResource(R.mipmap.asiento_red18);
                            temp18=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(19)){
                            asiento19= (ImageView) findViewById(R.id.asiento19);
                            asiento19.setImageResource(R.mipmap.asiento_red19);
                            temp19=false;
                        }
                        if ((jsonArray.getJSONObject(i).getInt("asiento"))==(20)){
                            asiento20= (ImageView) findViewById(R.id.asiento20);
                            asiento20.setImageResource(R.mipmap.asiento_red20);
                            temp20=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(21)){
                            asiento21= (ImageView) findViewById(R.id.asiento21);
                            asiento21.setImageResource(R.mipmap.asiento_red21);
                            temp21=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(22)){
                            asiento22= (ImageView) findViewById(R.id.asiento22);
                            asiento22.setImageResource(R.mipmap.asiento_red22);
                            temp22=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(23)){
                            asiento23= (ImageView) findViewById(R.id.asiento23);
                            asiento23.setImageResource(R.mipmap.asiento_red23);
                            temp23=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(24)){
                            asiento24= (ImageView) findViewById(R.id.asiento24);
                            asiento24.setImageResource(R.mipmap.asiento_red24);
                            temp24=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(25)){
                            asiento25= (ImageView) findViewById(R.id.asiento25);
                            asiento25.setImageResource(R.mipmap.asiento_red25);
                            temp25=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(26)){
                            asiento26= (ImageView) findViewById(R.id.asiento26);
                            asiento26.setImageResource(R.mipmap.asiento_red26);
                            temp26=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(27)){
                            asiento27= (ImageView) findViewById(R.id.asiento27);
                            asiento27.setImageResource(R.mipmap.asiento_red27);
                            temp27=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(28)){
                            asiento28= (ImageView) findViewById(R.id.asiento28);
                            asiento28.setImageResource(R.mipmap.asiento_red28);
                            temp28=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(29)){
                            asiento29= (ImageView) findViewById(R.id.asiento29);
                            asiento29.setImageResource(R.mipmap.asiento_red29);
                            temp29=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(30)){
                            asiento30= (ImageView) findViewById(R.id.asiento30);
                            asiento30.setImageResource(R.mipmap.asiento_red30);
                            temp30=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(31)){
                            asiento31= (ImageView) findViewById(R.id.asiento31);
                            asiento31.setImageResource(R.mipmap.asiento_red31);
                            temp31=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(32)){
                            asiento32= (ImageView) findViewById(R.id.asiento32);
                            asiento32.setImageResource(R.mipmap.asiento_red32);
                            temp32=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(33)){
                            asiento33= (ImageView) findViewById(R.id.asiento33);
                            asiento33.setImageResource(R.mipmap.asiento_red33);
                            temp33=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(34)){
                            asiento34= (ImageView) findViewById(R.id.asiento34);
                            asiento34.setImageResource(R.mipmap.asiento_red34);
                            temp34=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(35)){
                            asiento35= (ImageView) findViewById(R.id.asiento35);
                            asiento35.setImageResource(R.mipmap.asiento_red35);
                            temp35=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(36)){
                            asiento36= (ImageView) findViewById(R.id.asiento36);
                            asiento36.setImageResource(R.mipmap.asiento_red36);
                            temp36=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(37)){
                            asiento37= (ImageView) findViewById(R.id.asiento37);
                            asiento37.setImageResource(R.mipmap.asiento_red37);
                            temp37=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(38)){
                            asiento38= (ImageView) findViewById(R.id.asiento38);
                            asiento38.setImageResource(R.mipmap.asiento_red38);
                            temp38=false;
                        } if ((jsonArray.getJSONObject(i).getInt("asiento"))==(39)){
                            asiento39= (ImageView) findViewById(R.id.asiento39);
                            asiento39.setImageResource(R.mipmap.asiento_red39);
                            temp39=false;
                        }
                        if ((jsonArray.getJSONObject(i).getInt("asiento"))==(40)){
                            asiento40= (ImageView) findViewById(R.id.asiento40);
                            asiento40.setImageResource(R.mipmap.asiento_red40);
                            temp40=false;
                        }

                    }
               // Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
            }catch(Exception e){

            }

        }
    @Override
    public void onClick(View v) {
        if (boton==true) {
            nombre_completo=nombre.getText().toString();
            Intent i = new Intent(asiento.this, Mostrar_datos.class);
            i.putExtra("origen_completo",origen_completo);
            i.putExtra("destino_completo",destino_completo);
            i.putExtra("fecha",fecha);
            i.putExtra("nombre_completo",nombre_completo);
            i.putExtra("asiento",asiento);
            i.putExtra("corrida",corrida);
            i.putExtra("origen",origen);
            i.putExtra("destino",destino);
            i.putExtra("hora",hora);
            i.putExtra("hora",hora);
            i.putExtra("camion",camion);
           // Toast.makeText(getApplicationContext(), origen_completo, Toast.LENGTH_SHORT).show();
            startActivity(i);
            finish();
        }
        if (boton==false){
            Toast.makeText(getApplicationContext(), "Seleccione un asiento disponible", Toast.LENGTH_LONG).show();
        }
    }


}
