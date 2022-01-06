package at.ht.feedback

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import at.ht.feedback.databinding.FragmentQuestionBinding
import at.ht.feedback.databinding.FragmentSummaryBinding
import kotlinx.android.synthetic.main.fragment_question.*
import kotlinx.android.synthetic.main.fragment_welcome.*


class QuestionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentQuestionBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_question, container, false
        )

        binding.imageView2.setOnClickListener { navigateToSummary(it) }
        binding.imageView3.setOnClickListener { navigateToSummary(it) }
        binding.imageView4.setOnClickListener { navigateToSummary(it) }
        binding.imageView5.setOnClickListener { navigateToSummary(it) }
        binding.imageView6.setOnClickListener { navigateToSummary(it) }
        binding.imageView7.setOnClickListener { navigateToSummary(it) }
        binding.button2.setOnClickListener { navigateToNoAnswer(it) }

        // Inflate the layout for this fragment
        return binding.root
    }

    private fun navigateToNoAnswer(view: View) {
        view.findNavController().navigate(R.id.action_questionFragment_to_noAnswerFragment)
    }

    private fun navigateToSummary(view: View) {
        view.findNavController().navigate(R.id.action_questionFragment_to_summaryFragment)
    }

}