package com.example.weatherforecast.domain.model


//sealed class SignInUpOptions(title: String, index: Int) : TabRowSwitchable {
//    class SignIn(override val title: String = "Вход", override val index: Int = 0) : SignInUpOptions(title, index)
//    class SignUp(override val title: String = "Регистрация", override val index: Int = 1) : SignInUpOptions(title, index)
//
//    companion object {
//        fun getOptions(): List<SignInUpOptions> {
//            return listOf(SignIn(), SignUp())
//        }
//    }
//
//    override fun getByIndex(index: Int): TabRowSwitchable {
//        val options = getOptions()
//        return options.find { it.index == index }!!
//    }
//}

enum class ForecastPeriodOptions(
    override val title: String,
    override val index: Int
) : TabRowSwitchable {
    TODAY("Сегодня", 0),
    WEEK("Неделя", 1);

    companion object {
        fun getPeriods(): List<TabRowSwitchable> {
            return listOf(TODAY, WEEK)
        }
    }

    override fun getByIndex(index: Int): TabRowSwitchable {
        return getPeriods().find { it.index == index }!!
    }
}