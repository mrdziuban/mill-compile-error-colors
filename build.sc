import mill._, scalalib._

object example extends RootModule with SbtModule {
  def scalaVersion = "2.13.12"
  def scalacOptions = super.scalacOptions() :+ "-Vimplicits"
}
