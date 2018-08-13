package godsejeong.com.genius.activity.popup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.PopupWindow
import godsejeong.com.genius.R
import kotlinx.android.synthetic.main.activity_firemessge_popup.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class FiremessgePopupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firemessge_popup)

        val popupView = layoutInflater.inflate(R.layout.activity_fire_popup, null)
        var mPopupWindow = PopupWindow(popupView, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        mPopupWindow.isFocusable = true

        var context = intent.getStringExtra("context")
        firemessgeContent.text = context

        firemessgeCheck.onClick {
            finish()
        }
    }
}