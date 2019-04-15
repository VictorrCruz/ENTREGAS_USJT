package deswebmob.usjt.aula2_ciclo_de_vida_gps;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.List;

public class ListaLocalizacoesActivity extends AppCompatActivity {

    private RecyclerView localizacoesRecyclerView;
    private LocalizacaoAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_localizacoes);
        localizacoesRecyclerView = findViewById(R.id.localizacoesRecyclerView);
        localizacoesRecyclerView.setLayoutManager(new
                LinearLayoutManager(this));
        localizacoesRecyclerView.setAdapter(new LocalizacaoAdapter(adapter));
    }

}
