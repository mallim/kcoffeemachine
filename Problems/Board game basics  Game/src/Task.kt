import kotlin.math.max

class PlayingField{
    object Size{
        var width: Int = 0
        var height: Int = 0
        fun changeSize( width:Int, height:Int ){
            this.width = max( 0, width )
            this.height = max( 0, height )
        }
    }
}
