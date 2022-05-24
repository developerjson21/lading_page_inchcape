import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faChevronLeft } from "@fortawesome/free-solid-svg-icons";
import { faChevronRight } from "@fortawesome/free-solid-svg-icons";
import './Categorias.css'
let categorias = ["Most Popular", "Suvs", "Trucks", "Performance", "Coming Soon", "All Vehicles", "Previously Search"]

const Categorias = () => {
    
    return (
        <div className="div-section">
            <div className="div-categorias">
                <FontAwesomeIcon icon={faChevronLeft} />
                {categorias.map( (categoria, index)  => {
                    return <ul className="lista-categorias"><a href=""><li key={index}>{categoria}</li></a></ul>
                })}
                <FontAwesomeIcon icon={faChevronRight} />
            </div>
        </div>
        
    )
}

export default Categorias;