package casa.artesanato.folhadepedidos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butaoProduto = (Button) findViewById(R.id.button_add);
        butaoProduto.setOnClickListener(this);
        Button butaoPedido = (Button) findViewById(R.id.button_criar);
        butaoPedido.setOnClickListener(this);
        Button butaoVer = (Button) findViewById(R.id.button_ver);
        butaoVer.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_add:
                Intent it = new Intent(this,AdicionarProduto.class);
                startActivity(it);
                break;
            case R.id.button_criar:
                Intent intent = new Intent(this,CriarPedido.class);
                startActivity(intent);
                break;
            case R.id.button_ver:
                Intent intent1 = new Intent(this, VerPedidos.class);
                startActivity(intent1);
                break;
        }

    }
}
