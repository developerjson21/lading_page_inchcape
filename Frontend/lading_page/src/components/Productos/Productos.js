import CardProducto from './CardProducto';
import dataCategorias from '../Categorias/dataCategorias.json'

const Productos = (props) => { //Dentro de props necesito traer ya filtrado mi data!! 
    
    return (
        
         <div className="div-productos">
             {dataCategorias.map( (card, index) => {
                 return <CardProducto key={index} name={card.name} description={card.description} price={card.price} urlImg={card.urlImg}/>
             })}
         </div>   
        
    );    
}

export default Productos;