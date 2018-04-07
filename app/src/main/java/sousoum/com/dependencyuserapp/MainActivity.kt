package sousoum.com.dependencyuserapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import sousoum.com.dependencylib.Info
import sousoum.com.userlib.DependencyInfo

class MainActivity : AppCompatActivity() {

    private val info = Info()
    private val dependencyInfo = DependencyInfo()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        versionBt.setOnClickListener {
            Toast.makeText(this, info.version(), Toast.LENGTH_SHORT).show()
        }

        functionBt.setOnClickListener {
            Toast.makeText(this, info.v2Function(), Toast.LENGTH_SHORT).show()
        }

        versionThroughLibBt.setOnClickListener {
            Toast.makeText(this, dependencyInfo.dependencyVersion, Toast.LENGTH_SHORT).show()
        }

        functionThroughLibBt.setOnClickListener {
            Toast.makeText(this, dependencyInfo.useDependencyFunction(), Toast.LENGTH_SHORT).show()
        }
    }
}
