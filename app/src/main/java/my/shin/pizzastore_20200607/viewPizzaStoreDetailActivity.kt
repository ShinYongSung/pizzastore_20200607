package my.shin.pizzastore_20200607

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import kotlinx.android.synthetic.main.ViewPizzaStoreDetailActivity.*
import kotlinx.android.synthetic.main.ViewPizzaStoreDetailActivity.logoImg
import my.shin.pizzastore_20200607.Data.PizzaStore

class viewPizzaStoreDetailActivity : BaseActivity() {

    lateinit var mPizzaStore : PizzaStore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ViewPizzaStoreDetailActivity)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        callBtn.setOnClickListener() {

            val pl = object : PermissionListener {
                override fun onPermissionGranted() {
                    val myUri = Uri.parse("tel:${mPizzaStore.phoneNum}")
                    val myIntent = Intent (Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                }

            }

//            실제 권한 체크
            TedPermission.with(mContext)
                .setPermissionListener(pl)
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()
        }

    }

    override fun setValues() {

//        seriallizable 형태로 첨부된 가게 정보를 받아서 => PizzaStore형태로 변신 (Casting)시켜서
//        멤버 변수로 있는 피자가게 변수에 대입
        mPizzaStore = intent.getSerializableExtra("store") as PizzaStore

//        대입 된 피자 가게 변순의 데이터들을 이용해서 화면에 출력

        Glide.with(mContext).load(mPizzaStore.logoUrI).into(logoImg)
        storeNameTxt.text = mPizzaStore.name
        phoneNumTxt.text = mPizzaStore.phoneNum


    }


}
