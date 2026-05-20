fun main{
    val userName = "Татьяна"
    val userPatronymic = "Сергеева"
    var userSurname = "Андреева"
    var userAge = 20
    println("$userSurname $userName $userPatronymic, $userAge")
    userSurname = "Сидорова"
    println("$userSurname $userName $userPatronymic, ($userAge + 2)")
}