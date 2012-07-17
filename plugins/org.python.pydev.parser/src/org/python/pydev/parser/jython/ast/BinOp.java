// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

import org.python.pydev.parser.jython.SimpleNode;
import java.util.Arrays;

public final class BinOp extends exprType implements operatorType {
    public exprType left;
    public int op;
    public exprType right;

    public BinOp(exprType left, int op, exprType right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((left == null) ? 0 : left.hashCode());
        result = prime * result + op;
        result = prime * result + ((right == null) ? 0 : right.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BinOp other = (BinOp) obj;
        if (left == null) {
            if (other.left != null)
                return false;
        } else if (!left.equals(other.left))
            return false;
        if (this.op != other.op)
            return false;
        if (right == null) {
            if (other.right != null)
                return false;
        } else if (!right.equals(other.right))
            return false;
        return true;
    }

    public BinOp createCopy() {
        return createCopy(true);
    }

    public BinOp createCopy(boolean copyComments) {
        BinOp temp = new BinOp(left != null ? (exprType) left.createCopy(copyComments) : null, op,
                right != null ? (exprType) right.createCopy(copyComments) : null);
        temp.beginLine = this.beginLine;
        temp.beginColumn = this.beginColumn;
        if (this.specialsBefore != null && copyComments) {
            for (Object o : this.specialsBefore) {
                if (o instanceof commentType) {
                    commentType commentType = (commentType) o;
                    temp.getSpecialsBefore().add(commentType.createCopy(copyComments));
                }
            }
        }
        if (this.specialsAfter != null && copyComments) {
            for (Object o : this.specialsAfter) {
                if (o instanceof commentType) {
                    commentType commentType = (commentType) o;
                    temp.getSpecialsAfter().add(commentType.createCopy(copyComments));
                }
            }
        }
        return temp;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("BinOp[");
        sb.append("left=");
        sb.append(dumpThis(this.left));
        sb.append(", ");
        sb.append("op=");
        sb.append(dumpThis(this.op, operatorType.operatorTypeNames));
        sb.append(", ");
        sb.append("right=");
        sb.append(dumpThis(this.right));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitBinOp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (left != null) {
            left.accept(visitor);
        }
        if (right != null) {
            right.accept(visitor);
        }
    }

}
