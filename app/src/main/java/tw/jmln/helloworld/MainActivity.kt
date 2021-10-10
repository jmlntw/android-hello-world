package tw.jmln.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_item, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_about -> {
                val aboutDialogFragment = AboutDialogFragment()
                aboutDialogFragment.show(supportFragmentManager, "about")
                return true
            }
            R.id.menu_exit -> {
                this.finishAffinity()
                return true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }
}