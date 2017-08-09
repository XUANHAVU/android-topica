package tmei.studio.listviewnangcao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import tmei.studio.adapter.DanhBaAdapter;
import tmei.studio.model.DanhBa;

public class MainActivity extends AppCompatActivity {

    ListView lvDanhBa;
    ArrayList<DanhBa>dsDanhBa;
    DanhBaAdapter danhBaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
    }

    private void addControls() {
        lvDanhBa = (ListView) findViewById(R.id.lvDanhBa);
        dsDanhBa = new ArrayList<>();
        dsDanhBa.add(new DanhBa(1,"Vũ Xuân Hà","0972794074"));
        dsDanhBa.add(new DanhBa(2,"Vũ Lan Hương","0972555555"));
        dsDanhBa.add(new DanhBa(3,"Hà Đẹp Trai","0868888888"));
        dsDanhBa.add(new DanhBa(4,"Vũ Xuân Hà","0972999999"));

        danhBaAdapter = new DanhBaAdapter(MainActivity.this,R.layout.item,dsDanhBa);

        lvDanhBa.setAdapter(danhBaAdapter);
    }
}
