package my.shin.pizzastore_20200607

import android.os.Bundle
import my.shin.pizzastore_20200607.Data.PizzaStore

class ViewPizzaStoreDetailActivity : BaseActivity() {

    lateinit var mPizzaStore : PizzaStore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pizza_store_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

//        seriallizable 형태로 첨부된 가게 정보를 받아서 => PizzaStore형태로 변신 (Casting)시켜서
//        멤버 변수로 있는 피자가게 변수에 대입
        mPizzaStore = intent.getSerializableExtra("store") as PizzaStore

    }


}
