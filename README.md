# prototype---INF-4067

#### Prototype

##### objectif:

> permet de définir le genre d'objet à créer en dupliquant une instance qui sert d'exemple.

##### cas d'utilisation:

lorsque :

- la création d'une
  instance est complexe ou consommatrice en temps. Plutôt que créer plusieurs instances de la classe, on copie
  la première instance et on modifie la copie de façon appropriée

##### participants

- Prototype: sert de modèle principal pour la création de nouvelles copies. Les classes
- ConcretePrototype1 et ConcretePrototype2 viennent spécialiser la classe Prototype en venant par exemple
  modifier certains attributs. La méthode clone() doit retourner une copie de l'objet concerné. Les sous-classes
  peuvent hériter ou surcharger la méthode clone().
- Le Client: va se charger d'appeler les méthodes de
  clonage via sa méthode operation().
