package pins.data.ast.tree.expr;

import pins.common.report.*;
import pins.data.ast.tree.*;
import pins.data.ast.visitor.*;

/**
 * Atom expression, i.e., a constant.
 */
public class AstAtomExpr extends AstNode implements AstExpr {

	/** Types. */
	public enum Type {
		VOID, CHAR, INT, BOOL, POINTER, STRING
	};

	/** The type of a constant. */
	public final Type type;

	/** The value of a constant. */
	public final String value;

	/**
	 * Constructs an atom expression, i.e., a constant.
	 * 
	 * @param location The location.
	 * @param type     The type of a constant.
	 * @param value    The value of a constant.
	 */
	public AstAtomExpr(Location location, Type type, String value) {
		super(location);
		this.type = type;
		this.value = value;
	}

	@Override
	public <Result, Arg> Result accept(AstVisitor<Result, Arg> visitor, Arg arg) {
		return visitor.visit(this, arg);
	}

}
