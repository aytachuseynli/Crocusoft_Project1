package com.aytachuseynli.crocusoft_project1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aytachuseynli.crocusoft_project1.databinding.FragmentHomePageBinding
import com.aytachuseynli.crocusoft_project1.databinding.FragmentServicesPageBinding

class ServicesPageFragment : Fragment() {
    private var _binding: FragmentServicesPageBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter3: ServicesAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentServicesPageBinding.inflate(inflater, container, false)
        val view = binding.root


        val servicesList = ArrayList<ServicesList>()
        val s1 = ServicesList(1,"document_icon","Əhali abonentinin enerji təchizatı şəbəkəsinə qoşulması")
        val s2 = ServicesList(2,"payment_icon","Qoşulma Haqqının Onlayn Ödəlməsi")
        val s3 = ServicesList(3,"calculate_icon","Kalkulyatorlar")
        val s4 = ServicesList(4,"print_icon","Borcun araşdırılması və borcun olmaması (və ya olması) barədə sənədin verilməsi")
        val s5 = ServicesList(5,"note_icon","Əhali istehlakçısının ad dəyişdirilməsi")
        val s6 = ServicesList(6,"process_icon","Abonentin geniş tarixçəsinin verilməsi")
        val s7 = ServicesList(7,"table_icon","Yük hesabatının hazırlanması")
        val s8 = ServicesList(8,"connect_icon","İstehlakçının balansında olan elektrik şəbəkələrinə və avadanlıqlarına texniki xidmətin göstərilməsi")
        val s9 = ServicesList(9,"list_icon","Elektrik təchizatı sistemlərinin layihələndirilməsi və quraşdırılma işləri")
        val s10 = ServicesList(10,"activate_icon","Abonent kodunun PASSİV və AKTİV olunması üçün müraciətlərin qəbulu")
        val s11 = ServicesList(11,"register_icon","Çoxmənzilli binalarda yaşayış mənzillərinin qeydiyyata alınması")
        val s12 = ServicesList(12,"appeal_icon","Məcburi köçkün qrupuna aid abonentlərdən müraciətlərin qəbulu")



        servicesList.add(s1)
        servicesList.add(s2)
        servicesList.add(s3)
        servicesList.add(s4)
        servicesList.add(s5)
        servicesList.add(s6)
        servicesList.add(s7)
        servicesList.add(s8)
        servicesList.add(s9)
        servicesList.add(s10)
        servicesList.add(s11)
        servicesList.add(s12)



        adapter3 = ServicesAdapter(requireContext(),servicesList)
        adapter3.setDataList(servicesList)


        binding.rvServices.adapter = adapter3

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}