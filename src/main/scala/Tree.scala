sealed abstract class Tree[+T] {
  // P56
  def isSymmetric: Boolean = ???

  // P57
  def addValue[U >: T](x: U)(implicit o: U => Ordered[U]): Tree[U] = ???

  // P61
  def leafCount: Int = ???

  // P62
  def leafList: List[T] = ???

  def atLevel(n: Int): List[T] = ???

  // P64
  def layoutBinaryTree: PositionedNode[T] = ???

  // P65
  def layoutBinaryTree2: PositionedNode[T] = ???

  // P66
  def layoutBinaryTree3: PositionedNode[T] = ???

  // P68
  def preorder: List[T] = ???

  def inorder: List[T] = ???

  // P69
  def toDotString: String = ???
}

case class Node[+T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T] {
  override def toString = "T(" + value.toString + " " + left.toString + " " + right.toString + ")"
}

case object End extends Tree[Nothing] {
  override def toString = "."
}

case class PositionedNode[+T](value: T, left: Tree[T], right: Tree[T], x: Int, y: Int) extends Tree[T] {
  override def toString: String = "T[" + x.toString + "," + y.toString + "](" + value.toString + " " + left.toString + " " + right.toString + ")"
}

object Tree {
  // P55
  def cBalanced[T](n: Int, value: T): List[Tree[T]] = ???

  // P57
  def fromList[T](l: List[T]): Tree[T] = ???

  // P58
  def symmetricBalancedTrees[T](n: Int, value: T): List[Tree[T]] = ???

  // P59
  def hBalanced[T](n: Int, value: T): List[Tree[T]] = ???

  // P60
  def minHbalNodes(n: Int): Int = ???

  def maxHbalHeight(n: Int): Int = ???

  def hbalTreesWithNodes[T](n: Int, value: T): List[Tree[T]] = ???

  // P63
  def completeBinaryTree[T](n: Int, value: T): Tree[T] = ???

  // P67
  def fromString(s: String): Tree[String] = ???

  // P68
  def preInTree[T](preorder: List[T], inorder: List[T]): Tree[T] = ???

  // P69
  def fromDotString(s: String): Tree[String] = ???
}

object Node {
  def apply[T](value: T): Node[T] = Node(value, End, End)
}

object PositionedNode {
  def apply[T](value: T, x: Int, y: Int): PositionedNode[T] = PositionedNode(value, End, End, x, y)
}
