package com.example.solutionx

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.solutionx.feautres.login.domain.usecases.LoginWithEmailUseCase
import com.example.solutionx.feautres.login.presentation.MainViewModel
import com.example.solutionx.feautres.login.presentation.PersonIntent
import com.example.solutionx.feautres.login.presentation.PersonLoginState
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginWithEmailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginWithEmailFragment : Fragment() {

    private val viewModel:MainViewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_with_email, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        send()
        render()

    }

    private fun send() {
//        lifecycleScope.launch {
//            viewModel.intentPerson.send(
//                PersonIntent.LoginEmail())
//        }
    }

    fun render(){
            lifecycleScope.launch {
                viewModel.loginState.collect{
                        r->
                    when (r){
                        is PersonLoginState.IsLoading ->{
                        }
                        is PersonLoginState.Success ->{

                        }
                        is PersonLoginState.Error ->{

                        }

                        else -> {}
                    }
                }
            }
        }
    }

