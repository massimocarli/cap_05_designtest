package uk.co.massimocarli.designtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.edittext_activity_main.*

class EditTextActivity : AppCompatActivity() {

  private val ALLOWED_LENGTH_RANGE = 0..8

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.edittext_activity_main)
    setSupportActionBar(toolbar)
    username_edit_text.editText?.addTextChangedListener { editable ->
      username_edit_text.run {
        if (editable?.length in ALLOWED_LENGTH_RANGE) {
          error = getString(R.string.username_mandatory)
          isErrorEnabled = true
        } else {
          isErrorEnabled = false
        }
      }
    }
  }
}