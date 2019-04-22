package uk.co.massimocarli.designtest

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.coordinated_activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.coordinated_activity_main)
    setSupportActionBar(toolbar)
    fab.setOnClickListener {
      showSnackbar()
    }
  }

  private fun showSnackbar() =
    Snackbar
      .make(container, R.string.snackbar_message, Snackbar.LENGTH_SHORT)
      .setAction(R.string.snackbar_action) { showToast("SnackBar Selected!") }
      .addCallback(object : Snackbar.Callback() {
        override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
          showToast("SnackBar Dismissed!")
        }

        override fun onShown(sb: Snackbar?) {
          showToast("SnackBar Shown!")
        }
      })
      .setActionTextColor(Color.RED)
      .show()
}
