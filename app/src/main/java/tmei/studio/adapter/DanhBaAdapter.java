package tmei.studio.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

import tmei.studio.listviewnangcao.R;
import tmei.studio.model.DanhBa;

/**
 * Created by vuxua on 9/6/2016.
 */
public class DanhBaAdapter extends ArrayAdapter<DanhBa>
{
    // Đối số 1 : Màn hình sử dụng layout này
    Activity context;
    // Layout cho từng dòng muốn hiển thị (làm theo khách hàng)
    int resource;
    // Danh sách nguồn dữ liệu muốn hiện thị lên giao điện;
    List<DanhBa> objects;
    public DanhBaAdapter(Activity context, int resource, List<DanhBa> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource,null);
        TextView txtName = (TextView) row.findViewById(R.id.txtName);
        TextView txtPhone = (TextView) row.findViewById(R.id.txtPhone);
        ImageButton btnCall = (ImageButton) row.findViewById(R.id.btnCall);
        ImageButton btnContact = (ImageButton) row.findViewById(R.id.btnContact);
        ImageButton btnMail = (ImageButton) row.findViewById(R.id.btnMail);
        ImageButton btnVideo = (ImageButton) row.findViewById(R.id.btnVideo);
        ImageButton btnHead = (ImageButton) row.findViewById(R.id.btnHead);

        // Trả về danh bạ muốn vẽ
        DanhBa danhba = this.objects.get(position);
        txtName.setText(danhba.getName());
        txtPhone.setText(danhba.getPhone());
        return row;
    }
}
