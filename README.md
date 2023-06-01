# Servlet

Un Servlet est une classe Java qui s'exécute côté serveur et permet de gérer les requêtes HTTP entrantes et sortantes entre le client et le serveur web. Il permet ainsi de créer des applications web dynamiques en générant des pages web à la volée.

Pour créer un servlet en Java, voici les étapes à suivre :

Créer une classe Java qui étend HttpServlet.
Implémenter les méthodes doGet() et/ou doPost() en fonction des types de requêtes que votre servlet doit gérer.
Configurer le servlet dans le fichier web.xml ou utiliser l'annotation @WebServlet pour spécifier l'URL de votre servlet.
