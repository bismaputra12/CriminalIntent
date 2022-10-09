package bismaputra.bloodglucoselevelmonitor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.fragment.app.Fragment
import bismaputra.bloodglucoselevelmonitor.databinding.ActivityMainBinding.inflate
import bismaputra.bloodglucoselevelmonitor.databinding.GlucoseLevelFragmentBinding.inflate
import java.util.*

class GlucoseLevelFragment: Fragment() {

    private var _binding: GlucoseLevelFragment? = null
    private val binding
        get() = checkNotNull(_binding) {
            "Cannot access binding because it is null. Is the view visible?"
        }

    private lateinit var glucose: Glucose

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        glucose = Glucose(
            date = Date(),
            fasting = -1,
            breakfast = -1,
            lunch = -1,
            dinner = -1
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding =
            GlucoseLevelFragment.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}