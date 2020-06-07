package my.shin.pizzastore_20200607.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import my.shin.pizzastore_20200607.Data.PizzaStore
import my.shin.pizzastore_20200607.R

class PizzaStoreAdapter(context: Context, resourceId: Int, list: List<PizzaStore>) : ArrayAdapter<PizzaStore>(context,resourceId, list){

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        tempRow?.let {

        }.let {
            tempRow = inf.inflate(R.layout.pizza_store_list, null)
        }

        val row = tempRow!!

//        그려진 XML에 실제 피자가게 데이터를 반영

//        데이터가 반영될 뷰들을(XML을 담아둔 변수 row에서) 가져오는 작업

        val logoImg = row.findViewById<ImageView>(R.id.logoImg)
        val storeNameTxt = row.findViewById<TextView>(R.id.storeNameTxt)

//        뷰에 뿌려질 데이터를 들고 있는 변수를 생성
//        액티비티가 전달해준 목록인 mList에서 꺼내보자. =>
        val data = mList[position]

//        data안에 있는 가게이름을 => storeNameTxt의 글자로 설정
        storeNameTxt.text = data.name

//        data 안에 있는 Logouri를 이용해서 => 이미지를 웹에서 다운받아서서 => LogImg에 뿌려주기
        Glide.with(mContext).load(data.logoUrI).into(logoImg)

        return row

    }
}