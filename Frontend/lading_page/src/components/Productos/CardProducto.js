
const CardProducto = (props) => {
    
    return (
            <div className="div-card">
                <div className="div-imgProducto">
                    <img src={props.urlImg} />
                </div>
                <div className="div-description">
                    <span className="name-producto">
                    {props.name}
                    </span>
                    <div className="div-description">
                        <span>
                            {props.description}
                            <span>{props.price}</span>
                        </span>
                    </div>
                </div>
            </div>
    )
}

export default CardProducto;