package pins.data.ast.tree.decl;

import pins.common.report.*;
import pins.data.ast.tree.type.*;
import pins.data.ast.visitor.*;

/**
 * Parameter declaration.
 */
public class AstParDecl extends AstMemDecl {

	/**
	 * Constructs a parameter declaration.
	 * 
	 * @param location The location.
	 * @param name     The name of this parameter.
	 * @param type     The type of this parameter.
	 */
	public AstParDecl(Location location, String name, AstType type) {
		super(location, name, type);
	}

	@Override
	public <Result, Arg> Result accept(AstVisitor<Result, Arg> visitor, Arg arg) {
		return visitor.visit(this, arg);
	}

}
