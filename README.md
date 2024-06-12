# Page de connexion:

Utilisation des servlet pour créer une page de connexion et de validation des utilisateurs. 
Ainsi que l'importation de toutes les entrées de la base de données.  

## Structure des Fichiers:  
### Classes Java:  
  
LoginDao.java: Valide les identifiants de l'utilisateur.  
UserImporter.java: Importe tous les utilisateurs de la base de données.  
User.java: Représente un utilisateur avec des champs pour le nom et le mot de passe.  
LoginServlet.java: Servlet pour gérer les requêtes de connexion.  

### Fichiers JSP:  
  
index.jsp: Page de connexion.  
userLogged.jsp: Page d'accueil après connexion réussie.  
invalidLogin.jsp: Page affichée en cas d'échec de la connexion.  
  
## Dépendances:  
Inclure le pilote JDBC pour MySQL dans le fichier build.gradle.
