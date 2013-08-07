package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EsbGraphicalShape;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.FilterMediatorGraphicalShape;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.FixedBorderItemLocator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.ShowPropertyViewEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.complexFiguredAbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.editpolicy.FeedbackIndicateDragDropEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.utils.MediatorFigureReverser;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.ThrottleMediatorCanonicalEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.ThrottleMediatorItemSemanticEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;

/**
 * @generated NOT
 */
public class ThrottleMediatorEditPart extends complexFiguredAbstractMediator {

	public IFigure onAcceptOutputConnector;
	public IFigure onRejectOutputConnector;

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3493;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ThrottleMediatorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ThrottleMediatorItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new FeedbackIndicateDragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new ThrottleMediatorCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// For handle Double click Event.
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new ShowPropertyViewEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (EsbVisualIDRegistry.getVisualID(childView)) {
				case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
				case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
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

	/**
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ThrottleMediatorFigure() {
			public void setBounds(org.eclipse.draw2d.geometry.Rectangle rect) {
				super.setBounds(rect);
				if ((!connected)
						&& (this.getBounds().getLocation().x != 0 && this.getBounds().getLocation().y != 0)) {
					getMostSuitableElementToConnect();
					connected = true;
				}
			};
		};
	}

	/**
	 * @generated
	 */
	public ThrottleMediatorFigure getPrimaryShape() {
		return (ThrottleMediatorFigure) primaryShape;
	}

	/**
	 * @generated NOT
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ThrottleMediatorGroupIdEditPart) {
			((ThrottleMediatorGroupIdEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureThrottleMediatorPropertyValue());
			return true;
		}
		if (childEditPart instanceof ThrottleMediatorInputConnectorEditPart) {
			IFigure borderItemFigure = ((ThrottleMediatorInputConnectorEditPart) childEditPart)
					.getFigure();
			BorderItemLocator locator = new FixedBorderItemLocator(getMainFigure(),
					borderItemFigure, PositionConstants.WEST, 0.5);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure, locator);
			return true;
		}
		if (childEditPart instanceof ThrottleMediatorOutputConnectorEditPart) {
			IFigure borderItemFigure = ((ThrottleMediatorOutputConnectorEditPart) childEditPart)
					.getFigure();
			BorderItemLocator locator = new FixedBorderItemLocator(getMainFigure(),
					borderItemFigure, PositionConstants.EAST, 0.5);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure, locator);
			return true;
		}
		if (childEditPart instanceof ThrottleMediatorOnAcceptOutputConnectorEditPart) {
			onAcceptOutputConnector = ((ThrottleMediatorOnAcceptOutputConnectorEditPart) childEditPart)
					.getFigure();
		}
		if (childEditPart instanceof ThrottleMediatorOnRejectOutputConnectorEditPart) {
			onRejectOutputConnector = ((ThrottleMediatorOnRejectOutputConnectorEditPart) childEditPart)
					.getFigure();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ThrottleMediatorGroupIdEditPart) {
			return true;
		}
		if (childEditPart instanceof ThrottleMediatorInputConnectorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((ThrottleMediatorInputConnectorEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ThrottleMediatorOutputConnectorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((ThrottleMediatorOutputConnectorEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
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
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(EsbVisualIDRegistry
				.getType(ThrottleMediatorGroupIdEditPart.VISUAL_ID));
	}

	/**
	 * @generated NOT
	 */
	public class ThrottleMediatorFigure extends FilterMediatorGraphicalShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureThrottleMediatorPropertyValue;

		/**
		 * @generated NOT
		 */
		public ThrottleMediatorFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
			layoutThis.setSpacing(0);
			layoutThis.setVertical(false);
			this.setLayoutManager(layoutThis);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(170), getMapMode().DPtoLP(100)));
			this.setOutline(false);
			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		public void add(IFigure figure, Object constraint, int index) {
			if (figure instanceof DefaultSizeNodeFigure) {
				GridData layoutData = new GridData();
				layoutData.grabExcessHorizontalSpace = true;
				layoutData.grabExcessVerticalSpace = true;
				layoutData.horizontalAlignment = GridData.FILL;
				layoutData.verticalAlignment = GridData.FILL;
				super.add(figure, layoutData, index);
			} else if (figure instanceof RoundedRectangle) {
				GridData layoutData = new GridData();
				layoutData.grabExcessHorizontalSpace = true;
				layoutData.grabExcessVerticalSpace = true;
				layoutData.horizontalAlignment = GridData.FILL;
				layoutData.verticalAlignment = GridData.FILL;
				super.add(figure, layoutData, index);
			}

			else {
				super.add(figure, constraint, index);
			}
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureThrottleMediatorPropertyValue = new WrappingLabel();
			fFigureThrottleMediatorPropertyValue.setText("<...>");
			fFigureThrottleMediatorPropertyValue.setAlignment(SWT.CENTER);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureThrottleMediatorPropertyValue() {
			return fFigureThrottleMediatorPropertyValue;
		}

		public String getIconPath() {
			return "icons/ico20/throttle-mediator.gif";
		}

		public String getNodeName() {
			return "Throttle";
		}

		public IFigure getToolTip() {
			return new Label("Limit the number of messages");
		}

	}

	/**
	 * @generated NOT
	 */
	static final Color THIS_BACK = new Color(null, 255, 255, 255);

}
