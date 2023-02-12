object TP1Scala {

  /**
   * Exercice 1: Listes
   *
   * Insérer le chiffre 0 à la 5ème position
   */
  def exercice1(): List[Int] = {
    val input: List[Int] = List(1, 2, 3, 4, 5, 6, 7)

    val output: List[Int] = ??? // TODO générer la nouvelle liste

    output
  }

  /**
   * Exercice 2: Listes
   *
   * Implémenter et utiliser la méthode reverse, pour inverser
   * les élements d'une liste.
   * Ne pas utiliser la méthode reverse des listes
   * Pense à la récursion
   *
   */
  def exercice2(): List[Any] = {
    val input: List[Any] = List(1, 2, "3", 4.0, 5)

    def reverse(list: List[Any]): List[Any] = ???

    val output: List[Any] = reverse(input)

    output
  }

  /**
   * Exercice 3: Filter/Map
   *
   * Filtrer les élements de la liste pour ne retenir que les
   * mot commençant par la lettre A (case unsensitive), puis
   * renvoyer la longeur de chaque mot.
   *
   * Exemple: List("Char", "Arctique", "Mot", "allemagne") => List(8, 9)
   *
   */
  def exercice3(): List[Int] = {
    val input: List[String] = List("Argent", "Arbre", "bleu", "liste", "arbre")

    val output: List[Int] = ???

    output
  }

  /**
   * Exercice 4: Pattern Matching et options
   *
   * Ecrire la methode qui extrait la valeur d'une option si elle existe,
   * Ou de renvoyer la valeur par défaut -1 si elle n'existe pas
   *
   */
  def exercice4(opt: Option[Int]): Int = ???

  /**
   * Exercice 5: Exercice Complet
   *
   * Le but de cet exercice est de renvoyer un certain nombre d'informations
   * sur les 4 services d'une entreprise (Compta, Achat, Vente, RH)
   *    - Le nom du service avec le plus d'employés
   *    - Le salaire moyen de l'entreprise
   *    - La masse salariale de chaque service
   *    - Les services classés par masse salariale (de la plus grosse à la plus faible)
   *    - Les services n'employant pas de femme
   *
   * Ces informations devront etre contenues dans une instance de la case class Solution5
   *
   * Il faut d'abord définir le type qui convient le mieux de chaque élément de la case class
   * (remplacer le Any par le bon type)
   *
   * Vous êtes libres de procéder comme vous voulez.
   */

  case class Solution5(
                        service_avec_le_plus_demployes: Any,
                        salaire_moyen: Any,
                        masse_salariale_par_service: Any,
                        services_ordonnes_par_masse_salariale: Any,
                        services_integralement_masculins: Any
                      )

  def exercice5(): Solution5 = {

    case class Employe(id: Int, service: String, salaire: Double, masculin: Boolean)

    val liste_services: List[String] = List("Compta", "Achat", "Vente", "RH")

    val liste_des_employes: List[Employe] = List(
      Employe(id = 1, service = "Compta", salaire = 50000, masculin = false),
      Employe(id = 2, service = "Achat", salaire = 41000, masculin = false),
      Employe(id = 3, service = "Vente", salaire = 39000, masculin = false),
      Employe(id = 4, service = "RH", salaire = 50000, masculin = true),
      Employe(id = 5, service = "Vente", salaire = 120000, masculin = true),
      Employe(id = 6, service = "Vente", salaire = 10000, masculin = false),
      Employe(id = 7, service = "Vente", salaire = 45000, masculin = false),
      Employe(id = 8, service = "Achat", salaire = 110000, masculin = true),
      Employe(id = 9, service = "Vente", salaire = 27000, masculin = true),
      Employe(id = 10, service = "RH", salaire = 23000, masculin = false),
      Employe(id = 11, service = "RH", salaire = 13000, masculin = true)
    )

    val solution: Solution5 = ???
    solution
  }
}

