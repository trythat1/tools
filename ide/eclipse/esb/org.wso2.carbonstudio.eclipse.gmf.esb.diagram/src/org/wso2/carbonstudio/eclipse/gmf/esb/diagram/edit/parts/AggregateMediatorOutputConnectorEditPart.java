package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.AbstractOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.EastPointerShape;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.WestPointerShape;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies.AggregateMediatorOutputConnectorItemSemanticEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated NOT
 */
public class AggregateMediatorOutputConnectorEditPart extends
		AbstractOutputConnector {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3113;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated NOT
	 */
	protected IFigure primaryShapeForward;

	public IFigure primaryShapeReverse;

	public final boolean isInput = false;

	/**
	 * @generated
	 */
	public AggregateMediatorOutputConnectorEditPart(View view) {
		super(view);
	}

	public NodeFigure figure_;

	public NodeFigure getNodeFigureOutput() {
		return figure_;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AggregateMediatorOutputConnectorItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	public IFigure createNodeShapeReverse() {

		return primaryShapeReverse = new WestPointerFigure();
	}

	/**
	 * @generated NOT
	 */
	public IFigure createNodeShapeForward() {
		return primaryShapeForward = new EastPointerFigure();
	}

	/**
	 * @generated NOT
	 */
	public EastPointerFigure getPrimaryShapeForward() {
		return (EastPointerFigure) primaryShapeForward;
	}

	public WestPointerFigure getPrimaryShapeReverse() {
		return (WestPointerFigure) primaryShapeReverse;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(12, 10);

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated NOT
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShapeForward();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		figure_ = figure;
		createNodeShapeReverse();
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShapeForward != null) {
			primaryShapeForward.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShapeForward != null) {
			primaryShapeForward.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShapeForward instanceof Shape) {
			((Shape) primaryShapeForward).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShapeForward instanceof Shape) {
			((Shape) primaryShapeForward).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(EsbElementTypes.EsbLink_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ProxyInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof MessageInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DefaultEndPointInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof AddressEndPointInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DropMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof FilterMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof MergeNodeFirstInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof MergeNodeSecondInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof LogMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof PropertyMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof EnrichMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof XSLTMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SwitchMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SequenceInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof EventMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof EntitlementMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof ClassMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SpringMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof ScriptMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof FaultMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof XQueryMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CommandMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DBLookupMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof DBReportMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SmooksMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof SendMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof FailoverEndPointInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof WSDLEndPointInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof LoadBalanceEndPointInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof HeaderMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CloneMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CacheMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof IterateMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof AggregateMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof CalloutMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof TransactionMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		if (targetEditPart instanceof ThrottleMediatorInputConnectorEditPart) {
			types.add(EsbElementTypes.EsbLink_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == EsbElementTypes.EsbLink_4001) {
			types.add(EsbElementTypes.ProxyInputConnector_3003);
			types.add(EsbElementTypes.MessageInputConnector_3046);
			types.add(EsbElementTypes.DefaultEndPointInputConnector_3021);
			types.add(EsbElementTypes.AddressEndPointInputConnector_3030);
			types.add(EsbElementTypes.DropMediatorInputConnector_3008);
			types.add(EsbElementTypes.FilterMediatorInputConnector_3010);
			types.add(EsbElementTypes.MergeNodeFirstInputConnector_3014);
			types.add(EsbElementTypes.MergeNodeSecondInputConnector_3015);
			types.add(EsbElementTypes.LogMediatorInputConnector_3018);
			types.add(EsbElementTypes.PropertyMediatorInputConnector_3033);
			types.add(EsbElementTypes.EnrichMediatorInputConnector_3036);
			types.add(EsbElementTypes.XSLTMediatorInputConnector_3039);
			types.add(EsbElementTypes.SwitchMediatorInputConnector_3042);
			types.add(EsbElementTypes.SequenceInputConnector_3049);
			types.add(EsbElementTypes.EventMediatorInputConnector_3052);
			types.add(EsbElementTypes.EntitlementMediatorInputConnector_3055);
			types.add(EsbElementTypes.ClassMediatorInputConnector_3058);
			types.add(EsbElementTypes.SpringMediatorInputConnector_3061);
			types.add(EsbElementTypes.ScriptMediatorInputConnector_3064);
			types.add(EsbElementTypes.FaultMediatorInputConnector_3067);
			types.add(EsbElementTypes.XQueryMediatorInputConnector_3070);
			types.add(EsbElementTypes.CommandMediatorInputConnector_3073);
			types.add(EsbElementTypes.DBLookupMediatorInputConnector_3076);
			types.add(EsbElementTypes.DBReportMediatorInputConnector_3079);
			types.add(EsbElementTypes.SmooksMediatorInputConnector_3082);
			types.add(EsbElementTypes.SendMediatorInputConnector_3085);
			types.add(EsbElementTypes.FailoverEndPointInputConnector_3088);
			types.add(EsbElementTypes.WSDLEndPointInputConnector_3092);
			types.add(EsbElementTypes.LoadBalanceEndPointInputConnector_3095);
			types.add(EsbElementTypes.HeaderMediatorInputConnector_3100);
			types.add(EsbElementTypes.CloneMediatorInputConnector_3103);
			types.add(EsbElementTypes.CacheMediatorInputConnector_3106);
			types.add(EsbElementTypes.IterateMediatorInputConnector_3109);
			types.add(EsbElementTypes.AggregateMediatorInputConnector_3112);
			types.add(EsbElementTypes.CalloutMediatorInputConnector_3115);
			types.add(EsbElementTypes.TransactionMediatorInputConnector_3118);
			types.add(EsbElementTypes.ThrottleMediatorInputConnector_3121);
		}
		return types;
	}

	/*	*//**
			 * @generated NOT
			 */
	/*
	public class EastPointerFigure extends EastPointerShape {

	 *//**
		 * @generated NOT
		 */
	/*
	public EastPointerFigure() {

	this.setBackgroundColor(THIS_BACK);
	this.setPreferredSize(new Dimension(getMapMode().DPtoLP(12),
			getMapMode().DPtoLP(10)));

	this.addMouseMotionListener(new MouseMotionListener() {

		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		public void mouseHover(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			getEditDomain().getPaletteViewer().setActiveTool(null);

		}

		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub					
			getEditDomain()
					.getPaletteViewer()
					.setActiveTool(
							(ToolEntry) (((PaletteContainer) getEditDomain()
									.getPaletteViewer()
									.getPaletteRoot().getChildren()
									.get(4)).getChildren().get(0)));

		}

		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}
	});

	}

	}

	public class WestPointerFigure extends WestPointerShape {

	 *//**
		 * @generated NOT
		 */
	/*
	public WestPointerFigure() {

	this.setBackgroundColor(THIS_BACK);
	this.setPreferredSize(new Dimension(getMapMode().DPtoLP(12),
			getMapMode().DPtoLP(10)));
	this.addMouseMotionListener(new MouseMotionListener() {

		public void mouseMoved(MouseEvent me) {
			// TODO Auto-generated method stub

		}

		public void mouseHover(MouseEvent me) {
			// TODO Auto-generated method stub

		}

		public void mouseExited(MouseEvent me) {
			// TODO Auto-generated method stub
			getEditDomain().getPaletteViewer().setActiveTool(null);

		}

		public void mouseEntered(MouseEvent me) {
			// TODO Auto-generated method stub
			getEditDomain()
					.getPaletteViewer()
					.setActiveTool(
							(ToolEntry) (((PaletteContainer) getEditDomain()
									.getPaletteViewer()
									.getPaletteRoot().getChildren()
									.get(4)).getChildren().get(0)));

		}

		public void mouseDragged(MouseEvent me) {
			// TODO Auto-generated method stub

		}
	});
	}

	}*/

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 50, 50, 50);

}
