package jp.techacademy.takuya.katuoka.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.support.design.widget.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_plus.setOnClickListener(this)
        button_minus.setOnClickListener(this)
        button_times.setOnClickListener(this)
        button_division.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        if (editText1.text.toString().equals("")  || editText2.text.toString().equals("")) {
            button_plus.setOnClickListener { view ->
                Snackbar.make(view, "入力をして下さい", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Action") {
                        }.show()
            }
            button_minus.setOnClickListener { view ->
                Snackbar.make(view, "入力をして下さい", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Action") {
                        }.show()
            }
            button_times.setOnClickListener { view ->
                Snackbar.make(view, "入力をして下さい", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Action") {
                        }.show()
            }
            button_division.setOnClickListener { view ->
                Snackbar.make(view, "入力をして下さい", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Action") {
                        }.show()
            }
        } else {
            val intent = Intent(this, SecondActivity::class.java)
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()
            val calc1 = text1.toDouble()
            val calc2 = text2.toDouble()
            var calc_ans: Double = 0.0
            if (v!!.id == R.id.button_plus) {
                calc_ans = calc1 + calc2
                intent.putExtra("VALUE1", "$calc_ans")
                startActivity(intent)
            } else if (v!!.id == R.id.button_minus) {
                calc_ans = calc1 - calc2
                intent.putExtra("VALUE1", "$calc_ans")
                startActivity(intent)
            } else if (v!!.id == R.id.button_times) {
                calc_ans = calc1 * calc2
                intent.putExtra("VALUE1", "$calc_ans")
                startActivity(intent)
            } else if (v!!.id == R.id.button_division) {
                calc_ans = calc1 / calc2
                intent.putExtra("VALUE1", "$calc_ans")
                startActivity(intent)
            }
        }
    }

}
