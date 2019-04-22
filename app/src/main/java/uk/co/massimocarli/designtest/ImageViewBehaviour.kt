package uk.co.massimocarli.designtest

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar

class ImageViewBehaviour(context: Context?, attrs: AttributeSet?) :
  CoordinatorLayout.Behavior<ImageView>(context, attrs) {

  override fun layoutDependsOn(
    parent: CoordinatorLayout,
    child: ImageView,
    dependency: View
  ): Boolean =
    dependency is Snackbar.SnackbarLayout

  override fun onDependentViewChanged(
    parent: CoordinatorLayout,
    child: ImageView, dependency: View
  ): Boolean {
    val translationY = Math.min(0f, dependency.translationY - dependency.height)
    child.setTranslationY(translationY);
    child.rotation = translationY
    return true
  }
}