package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
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
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
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
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.EsbGraphicalShape;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.EsbGroupBox;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.EsbGroupingShape;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.FixedBorderItemLocator;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.ShowPropertyViewEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies.AggregateMediatorCanonicalEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies.AggregateMediatorItemSemanticEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies.EsbTextSelectionEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;

/**
 * @generated NOT
 */
public class AggregateMediatorEditPart extends AbstractMediator {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3111;

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
	public AggregateMediatorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AggregateMediatorItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new AggregateMediatorCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// For handle Double click Event.
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new ShowPropertyViewEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (EsbVisualIDRegistry.getVisualID(childView)) {
				case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
				case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
				case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new EsbTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new AggregateMediatorFigure();
	}

	/**
	 * @generated
	 */
	public AggregateMediatorFigure getPrimaryShape() {
		return (AggregateMediatorFigure) primaryShape;
	}

	/**
	 * @generated NOT
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AggregateMediatorAggregateIDEditPart) {
			((AggregateMediatorAggregateIDEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAggregateMediatorPropertyValue());
			return true;
		}
		if (childEditPart instanceof AggregateMediatorInputConnectorEditPart) {
			IFigure borderItemFigure = ((AggregateMediatorInputConnectorEditPart) childEditPart)
					.getFigure();
			BorderItemLocator locator = new FixedBorderItemLocator(
					getMainFigure(), borderItemFigure, PositionConstants.WEST,
					0.5);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
					locator);
			return true;
		}
		if (childEditPart instanceof AggregateMediatorOutputConnectorEditPart) {
			IFigure borderItemFigure = ((AggregateMediatorOutputConnectorEditPart) childEditPart)
					.getFigure();
			BorderItemLocator locator = new FixedBorderItemLocator(
					getMainFigure(), borderItemFigure, PositionConstants.EAST,
					0.5);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
					locator);

			return true;
		}

		if (childEditPart instanceof AggregateMediatorOnCompleteOutputConnectorEditPart) {
			IFigure borderItemFigure = ((AggregateMediatorOnCompleteOutputConnectorEditPart) childEditPart)
					.getFigure();
			/*	BorderItemLocator locator = new FixedBorderItemLocator(
						(IFigure)((IFigure) ((IFigure) ((IFigure) ((IFigure) getFigure()
								.getChildren().get(0)).getChildren().get(0))
								.getChildren().get(0)).getChildren().get(0)).getChildren().get(0),
						borderItemFigure, PositionConstants.EAST, 0.5);*/
			BorderItemLocator locator = new FixedBorderItemLocator(
					(IFigure) ((IFigure) ((IFigure) (IFigure) getFigure()
							.getChildren().get(0)).getChildren().get(0))
							.getChildren().get(0), borderItemFigure,
					PositionConstants.EAST, 0.5);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
					locator);
			/*System.out.println(((IFigure) ((IFigure) ((IFigure) getFigure())
					.getChildren().get(0)).getChildren().get(0)).getChildren()
					.get(0).getClass());*/
			//System.out.println(((IFigure)((IFigure)((IFigure)((IFigure)((IFigure)getFigure().getChildren().get(0)).getChildren().get(0)).getChildren().get(0))).getChildren().get(0)).getChildren().get(0).getClass());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AggregateMediatorAggregateIDEditPart) {
			return true;
		}
		if (childEditPart instanceof AggregateMediatorInputConnectorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((AggregateMediatorInputConnectorEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof AggregateMediatorOutputConnectorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((AggregateMediatorOutputConnectorEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof AggregateMediatorOnCompleteOutputConnectorEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((AggregateMediatorOnCompleteOutputConnectorEditPart) childEditPart)
							.getFigure());
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
				.getType(AggregateMediatorAggregateIDEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class AggregateMediatorFigure extends EsbGroupingShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAggregateMediatorPropertyValue;

		/**
		 * @generated NOT
		 */
		public AggregateMediatorFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutThis.setSpacing(5);
			layoutThis.setVertical(false);

			this.setLayoutManager(layoutThis);

			this.setBackgroundColor(new Color(null, 255, 255, 255));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureAggregateMediatorPropertyValue = new WrappingLabel();

			EsbGroupBox groupBox = new EsbGroupBox() {
				public String getIconPath() {
					return "icons/ico20/aggregate-mediator.gif";
				}

				public String getNodeName() {
					return "AGGREGATE";
				}
			};
			GridData constraintImageRectangle1 = new GridData();
			constraintImageRectangle1.verticalAlignment = GridData.FILL_BOTH;
			constraintImageRectangle1.horizontalAlignment = GridData.END;
			constraintImageRectangle1.horizontalIndent = 0;
			constraintImageRectangle1.horizontalSpan = 1;
			constraintImageRectangle1.verticalSpan = 1;
			constraintImageRectangle1.grabExcessHorizontalSpace = true;
			constraintImageRectangle1.grabExcessVerticalSpace = true;
			this.add(groupBox, constraintImageRectangle1);
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAggregateMediatorPropertyValue() {
			return fFigureAggregateMediatorPropertyValue;
		}

		public String getIconPath() {
			return "icons/ico20/aggregate-mediator.gif";
		}

		public String getNodeName() {
			return "Aggregate";
		}

		//Override to get dashed line.
		public int getLineStyle() {
			return 2;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 230, 230, 230);

	public boolean getIsForward() {
		return isForward;
	}

	public void setIsForward(boolean isForward_) {
		isForward = isForward_;

	}

}
