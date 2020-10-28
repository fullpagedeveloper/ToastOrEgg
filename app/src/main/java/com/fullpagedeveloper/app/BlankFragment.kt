package com.fullpagedeveloper.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fullpagedeveloper.toastegg.toastOrEgg
import kotlinx.android.synthetic.main.fragment_blank.view.*

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.btn_fragment.setOnClickListener {
            activity?.toastOrEgg("hahahah", 0, R.color.black, R.color.white, R.drawable.ic_baseline_check_24)
        }

        view.btn_fragment2.setOnClickListener {
            activity?.toastOrEgg("hahahah", 1, R.color.red)
        }
    }
}